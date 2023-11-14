CREATE SEQUENCE major_category_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE course_category_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE course_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE spot_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE course_spot_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE restaurant_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE meal_option_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE restaurant_meal_seq START WITH 1 INCREMENT BY 1;

--Create
CREATE TABLE major_categories (
    id BIGINT PRIMARY KEY DEFAULT nextval('major_category_seq'),
    name VARCHAR(255) NOT NULL
);

CREATE TABLE course_categories (
    id BIGINT PRIMARY KEY DEFAULT nextval('course_category_seq'),
    major_category_id BIGINT REFERENCES  major_categories(id),
    name VARCHAR(255) NOT NULL
);

CREATE TABLE courses (
     id BIGINT PRIMARY KEY DEFAULT nextval('course_seq'),
     course_category_id BIGINT REFERENCES course_categories(id),
     name VARCHAR(255) NOT NULL,
     duration FLOAT NOT NULL,
     max_spots INT NOT NULL,
     price DECIMAL NOT NULL
);

CREATE TABLE spots (
    id BIGINT PRIMARY KEY DEFAULT nextval('spot_seq'),
    name VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    image_path VARCHAR(255) NOT NULL
);

CREATE TABLE courses_spots (
    id BIGINT PRIMARY KEY DEFAULT nextval('course_spot_seq'),
    course_id BIGINT REFERENCES courses(id),
    spot_id BIGINT REFERENCES spots(id)
);

CREATE TABLE restaurants (
    id BIGINT PRIMARY KEY DEFAULT nextval('restaurant_seq'),
    name VARCHAR(100),
    description VARCHAR(255),
    location VARCHAR(255),
    ratings float
);

CREATE TABLE meal_options (
    id BIGINT PRIMARY KEY DEFAULT nextval('meal_option_seq'),
    name VARCHAR(100),
    description VARCHAR(255)
);

CREATE TABLE restaurant_meals (
    id BIGINT PRIMARY KEY DEFAULT nextval('restaurant_meal_seq'),
    restaurant_id BIGINT REFERENCES restaurants(id),
    meal_option_id BIGINT REFERENCES meal_options(id)
);

-- Insert
INSERT INTO major_categories (name) VALUES
('おすすめコース'),
('ラグジュアリーコース');

INSERT INTO course_categories (name, major_category_id) VALUES
('世界遺産巡りコース', 1),
('京の王道・人気コース', 1),
('雅な京都・老舗巡り', 1),
('ヘリ観光プラン', 2),
('抹茶作り体験 + 観光プラン', 2);

-- Prices are example values
INSERT INTO courses (course_category_id, name, duration, max_spots, price) VALUES
(1, '4時間コース', 4, 3, 5000),
(1, '6時間コース', 6, 5, 7500),
(1, '8時間コース', 8, 6, 10000),
(2, '4時間コース', 4, 3, 5000),
(2, '6時間コース', 6, 5, 7500),
(2, '8時間コース', 8, 6, 10000),
(3, '6時間コース', 6, 5, 7500),
(3, '8時間コース', 8, 7, 10000);

INSERT INTO spots (name, description, image_path) VALUES
('上賀茂神社', '', ''),--1
('下鴨神社', '', ''),--2
('清水寺', '', ''),--3
('銀閣寺', '', ''),--4
('金閣寺', '', ''),--5
('二条城', '', ''),--6
('仁和寺', '', ''),--7
('龍安寺', '', ''),--8
('天龍寺', '', ''),--9
('西芳寺', '', ''),--10
('高山寺', '', ''),--11
('東寺', '', ''),--12
('醍醐寺', '', ''),--13
('平等院', '', ''),--14
('宇治上神社', '', ''),--15
('延暦寺', '', ''),--16
('竹林の小径', '', ''),--17
('嵐山散策', '', ''),--18
('貴船神社', '', ''),--19
('今宮神社', '', ''),--20
('上林三入 抹茶体験', '', ''),--21
('雲龍院', '', ''),--22
('三十三間堂', '', ''),--23
('泉涌寺', '', ''),--24
('智積院', '', ''),--25
('西尾八つ橋の里', '', ''),--26
('金戒光明寺', '', ''),--27
('金地院', '', ''),--28
('南禅寺 水路閣', '', ''),--29
('法然院', '', ''),--30
('聖護院門跡', '', ''),--31
('相国寺', '', ''),--32
('枳殻邸', '', ''),--33
('西本願寺', '', ''),--34
('錦市場', '', ''),--35
('伏見稲荷大社', '', ''),--36
('光明院', '', '');--37

INSERT INTO courses_spots (course_id, spot_id) VALUES
--世界遺産巡り
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(1, 6),
(1, 7),
(1, 8),
(1, 9),
(1, 10),
(1, 11),
(1, 12),
(1, 13),
(1, 14),
(1, 15),
(1, 16),
(1, 34),
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(1, 6),
(1, 7),
(1, 8),
(1, 9),
(1, 10),
(1, 11),
(1, 12),
(1, 13),
(1, 14),
(1, 15),
(1, 16),
(1, 34),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(2, 6),
(2, 7),
(2, 8),
(2, 9),
(2, 10),
(2, 11),
(2, 12),
(2, 13),
(2, 14),
(2, 15),
(2, 16),
(2, 34),
(3, 1),
(3, 2),
(3, 3),
(3, 4),
(3, 5),
(3, 6),
(3, 7),
(3, 8),
(3, 9),
(3, 10),
(3, 11),
(3, 12),
(3, 13),
(3, 14),
(3, 15),
(3, 16),
(3, 34),
-- 人気コース
(4, 5),
(4, 6),
(4, 3),
(5, 17),
(5, 9),
(5, 18),
(5, 5),
(5, 3),
(6, 19),
(6, 20),
(6, 2),
(6, 35),
(6, 36),
(7, 37),
(7, 24),
(7, 25),
(7, 26),
(7, 27),
(8, 28),
(8, 29),
(8, 30),
(8, 26),
(8, 31),
(8, 32),
(8, 33);
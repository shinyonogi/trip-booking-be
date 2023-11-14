CREATE SEQUENCE major_category_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE course_category_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE course_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE spot_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE course_spot_seq START WITH 1 INCREMENT BY 1;

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

-- Insert
INSERT INTO major_categories (name) VALUES ('おすすめコース'), ('ラグジュアリーコース');

INSERT INTO course_categories (name, major_category_id) VALUES ('世界遺産巡りコース', 1), ('京の王道・人気コース', 1), ('雅な京都・老舗巡り', 1);

INSERT INTO courses (course_category_id, name, duration, max_spots, price) VALUES
(1, '4時間コース', 4, 3, 5000),
(1, '6時間コース', 6, 5, 7500),
(1, '8時間コース', 8, 7, 10000),
(2, '4時間コース', 4, 3, 5000),
(2, '6時間コース', 6, 5, 7500),
(2, '8時間コース', 8, 7, 10000),
(3, '4時間コース', 4, 3, 5000),
(3, '6時間コース', 6, 5, 7500),
(3, '8時間コース', 8, 7, 10000);

INSERT INTO spots (name, description, image_path) VALUES
('金閣寺', '綺麗なお寺', ''),
('銀閣寺', '適当なお寺', ''),
('お寺３', 'テストお寺', ''),
('お寺4', 'テストお寺', ''),
('お寺5', 'テストお寺', ''),
('お寺6', 'テストお寺', ''),
('お寺7', 'テストお寺', ''),
('お寺8', 'テストお寺', ''),
('お寺9', 'テストお寺', ''),
('お寺10', 'テストお寺', '');

INSERT INTO courses_spots (course_id, spot_id) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(2, 6),
(2, 7),
(3, 1),
(3, 2),
(3, 3),
(3, 4),
(3, 5),
(3, 6),
(3, 7),
(3, 8),
(3, 9),
(3, 10);
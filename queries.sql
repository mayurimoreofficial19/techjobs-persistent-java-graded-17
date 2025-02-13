--Part 1
-- Column Name         | Data Type
-- -----------------------------------
-- job_id              | INT
-- job_name            | VARCHAR(255)
-- job.skills          | VARCHAR(255)

--Part 2
SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT *
FROM skill
JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;


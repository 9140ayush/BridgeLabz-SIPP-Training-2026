-- Use Case 1: Highest Confirmed Cases (INNER JOIN)
SELECT c.country_name, cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c
    ON cc.country_id = c.country_id
WHERE cc.date = '2020-05-01'
ORDER BY cc.confirmed_cases DESC
LIMIT 1;

-- Use Case 2: Deaths + Vaccination (LEFT JOIN)
SELECT cd.country_id, cd.total_deaths, cv.vaccinated
FROM covid_deaths cd
LEFT JOIN covid_vaccines cv
    ON cd.country_id = cv.country_id;

-- Use Case 3: Deaths by Continent (GROUP BY)
SELECT con.continent_name, SUM(cc.deaths) AS total_deaths
FROM covid_cases cc
INNER JOIN continents con
    ON cc.continent_id = con.continent_id
GROUP BY con.continent_name;

-- Use Case 4: Avg Daily Deaths (AVG + ORDER)
SELECT date, AVG(deaths) AS avg_daily_deaths
FROM covid_cases
GROUP BY date
ORDER BY date;

-- Use Case 5: Highest Infection Rate
SELECT c.country_name,
       (cc.confirmed_cases * 100.0 / c.population) AS infection_rate
FROM covid_cases cc
INNER JOIN countries c
    ON cc.country_id = c.country_id
ORDER BY infection_rate DESC;

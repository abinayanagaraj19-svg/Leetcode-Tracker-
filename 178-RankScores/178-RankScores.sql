-- Last updated: 09/07/2026, 15:09:37
SELECT
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;
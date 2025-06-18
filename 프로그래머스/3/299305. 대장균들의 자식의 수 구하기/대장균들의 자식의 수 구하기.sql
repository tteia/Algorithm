select x.id, count(y.parent_id) as child_count
from ECOLI_DATA x
left join ECOLI_DATA y
on x.id = y.parent_id
group by 1
order by 1;
package data.entities;

/**
 * Lists types of points that a teacher can give to a student.
 * <ul>
 *     <li>CLASS_WORK - a point student can earn while doing work during a class, e.g. solving
 *     a problem at the blackboard etc.</li>
 *     <li>HOMEWORK - a point student can earn for doing homework. This is used separately from
 *     the class work to include the situation when one student can get more than one points
 *     during one lesson</li>
 *     <li>INDEPENDENT_WORK - a point student can earn for writing independent individual work
 *     during class work. This is usually treated as a regular point but it would make sense
 *     to distinguish it from a class work or homework point</li>
 *     <li>TEST - a point student can earn for a test at the end of each topic</li>
 *     <li>TOPICAL - the average of all points achieved by a student during a unit (topic),
 *     including a score for a test</li>
 *     <li>SEMESTER - a point student gets at the end of each semester. Generally, it is the
 *     average of all topical points achieved in this semester.</li>
 *     <li>ANNUAL - a point student gets at the end of each academic year. Generally, it is
 *     the average of semester points</li>
 *     <li>NOTEBOOK - <b>[optional]</b> A note student can earn for keeping a notebook</li>
 * </ul>
 */
public enum PointType {
    CLASS_WORK, HOMEWORK, INDEPENDENT_WORK, TEST, TOPICAL, SEMESTER, ANNUAL, NOTEBOOK
}

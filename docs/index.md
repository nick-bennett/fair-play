## Summary

_Fair Play_ is a simple Android app, intended for use by teachers who need to call on individual students in randomized order or organize students into groups for collaborative activities.

## Intended users

* Teachers who frequently have students solve problems at the whiteboard in front of the class, but want to be unbiased in their selections.

    > As math teacher with an interactive teaching style, I want to select individual students in a random order for solving problems at the whiteboard, to lessen the likelihood that some students will feel picked on by being called on more frequently than they perceive to be fair.
    
* Teachers or facilitator who conduct group-oriented activities, but don't want this to encourage teh formation of long-lived cliques within the class.

    > As a programming teacher who frequently organizes students into groups for brainstorming/problem-solving activities, I need to be able to assign students to groups randomly, but with weighting of previous assignments biasing the process _against_ repeating the assignments of any given student subset too often, in order to keep the groups dynamic and encourage cross-pollination of ideas and problem-solving approaches.
    
## Problems addressed 

The fundamental objective, in developing this app, is to provide a tool for use by teachers, facilitators, etc., to address&mdash;in a straightforward, easy-to-understand and use manner&mdash;the concerns below.

* **Selection &amp; shuffling**

    Many classroom activities require random selection and ordering of students, so that they be called on in a random order. However, as the developers of music player software (for example) have learned, human beings often perceive patterns even in purely random sequences, so it's sometimes helpful to bias this process. One approach is a sort of _weighted perpetual shuffle_: Rather than pure random sampling-with-replacement (in which even the most recently selected student is just as likely to be selected next as any other given student), or pure sampling-without-replacement (in which no student that has been called on in the current sequence will be called on again until the previous shuffle is completely exhausted), this is a sampling-with-replacement scheme in which the probability of selection is not uniform across all students, but is weighted so that more recently selected students are less likely to be selected again&mdash;but still may be selected. 

    The hope is that this approach will lessen (even if it never wholly eliminates) the likelihood that a student will perceives themselves to be selected more often than their peers, while still keeping the order from being entirely predictable.

* **Assignment to groups**

    Just as an unbiased sampling-with-replacement scheme will occasionally result in seemingly long runs (where the same item is selected multiple times in a row) or near-runs (where the same item appears much more frequently in a subsequence than would typically be expected), random groupings will sometimes result in some combination of items being grouped together much more frequently than expected. Part of this a perception problem: human beings are highly susceptible to confirmation bias, and they often see patterns when there is nothing more than coincidence. But beyond attempting to combat such perceptions, there is value in biasing successive partitioning of members of a set into subsets, to reduce the likelihood of repeated assignments&mdash;occurring closely together&mdash;of any given combination of 2 or more elements together in a subset. In social or educational contexts, such an approach might be employed to minimize the formation of long-lived cliques, or to promote cross-pollination of ideas.

    An example of a current application of this concept is found in [Friday Networking Lunch](https://gofnl.com), which uses a biased rotation scheme to group members together for weekly lunches at different restaurants, with the promise to the members that (among other things) they will have opportunities to network, face-to-face, with a frequently changing group of other members.

## Functionality

* Import, creation, and editing of student rosters.

* Flexible configuration of seating diagrams, for visual highlighting of student selection and group assignments.

* Configurable weighting of past selections and assignments in new selection and assignments, to control the bias (or lack of same) against repeated selections and assignment groupings.

* Manual override of generated shuffles and group assignments.

## Persistent data

* Student rosters

* Seating layouts

* Past selections/shuffles.

* Past group assignments.

* Weighting schemes.
    
## Device/external services

* Reading external files for importing student rosters.

* Export of student shuffles and group assignments.

## Stretch goals/possible enhancements 

* Import of rosters from Android contacts.

* Export of selections and group assignments to Android messaging or e-mail.

* Export (to SVG files) of seating diagrams with group assignments highlighted using different colors.


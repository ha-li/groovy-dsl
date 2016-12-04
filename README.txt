A domain specific language (DSL) has 1 main use, to provide a non-programmer
a simple natural language syntax as a means to interface with a program
that would otherwise be too complicated to work with.

In a technical or expertise domain, it is usually desirable to provide the
scientist a means of working with large data sets without requiring they learn
a particular programming language. Scientists have the domain expertise (they are
the SME's) but are not programmers. Bootstrapping them in a programming language
with a time costly and resource expensive endeavor and is in no ones best
interest to make them programmers. An ideal situation would be to be able to
provide scientist with a semi-programmable environment where they may
test new ways of doing/thinking about their data, without having to work with
a full time software engineer. Such an environment would be programmable and
configurable, but would have simple rules and a language as close to a
natural language as possible.

Groovy can provide such an environment through the smart use of their DSL.
Some of the features of the DSL include:
 - flexible syntax
 - natural language syntax
 - simplified punctuation rules like no semi-colon, no brackets in method calls
 - clean separation of business (SME) concerns from infrastructure code

In this project is a simple application that controls a robot through a series
of commands like:
 move left
 move right
 move forward
 move backwards


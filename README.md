# recrutemed

## Description
Backend functionality for recrutemed-ui application.

## Setup
- Run `git clone git@github.ibm.com:MentoringSpring/mentoring_project.git`

## Run

### Development

#### Application profiles
Recrutemed application uses the Spring Profiles approach to separate parts of application configuration and make it dependent on the environment.

    - ldev: Application running in local development environment with H2 in-memory database
    - ldevpg: Application running in local development environment with PostgreSQL database    
    - test: Test environment
    
#### Required dependencies
These are the required dependencies for the project:

	- Wiremock (for testing purposes)
	- flyway (for database versioning)
	- H2 in-memory database (local development ldev profile)
	- PostgreSQL database (local development ldevpg profile - refer to PostgreSQL database and pgAdmin4 run as docker containers)

#### Build and run application

    - Build `gw build`
    
#### To test if the application works

    - Navigate to localhost:8080/about
    
#### Used ports

Profile [default]:

    - application port: 8080


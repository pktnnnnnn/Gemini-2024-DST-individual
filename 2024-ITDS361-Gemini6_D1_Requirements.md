# G6 Gemini Software Requirements

## Functional Requirements

### 1. Observing Modes & Remote Operations

- Support **Interactive, Queue-based, Remote, and Service Observing** modes.
- Allow seamless switching between telescope modes and instruments.
- Enable **full remote monitoring, diagnostics, and control**.
- Provide **virtual telescope simulations** for training and interactive observing.

### 2. User Access & Collaboration

- **Multi-user access** (up to 10 concurrent users) with no delays.
- **Role-specific interfaces** for Astronomers, Telescope Operators, and Administrators.
- Secure **authentication** (e.g., two-factor) and **role-based access control** (e.g., restricted sensitive operations).
- Real-time collaboration tools for remote troubleshooting and multipoint monitoring.

### 3. Scheduling & Queue Management

- **Queue-based scheduling** with adjustments for priorities, weather, and configurations.
- Real-time scheduling tools and status updates (≤4 seconds).

### 4. Real-Time Features & Data Handling

- **Real-time data display**, error notifications, and fault categorization (Fatal/Serious/Warning).
- Automated **data archiving** in FITS format, preprocessing, quality checks, and backups.
- Support online calibrations and basic data reductions.

### 5. Error Handling & Reliability

- Detailed error logging with actionable guidance for users.
- Minimize subsystem failures impacting operations.
- Robust fault management and recovery mechanisms.

### 6. Workflow Efficiency

- Streamlined workflows for science plan creation, validation, submission, and execution.
- Tools for observation scheduling, monitoring, and subsystem maintenance.

---

## Non-Functional Requirements

### 1. Performance

- **Response time ≤2 seconds** for basic commands.
- **Status updates ≤4 seconds** for internal stations.
- Minimal latency for remote collaboration and real-time monitoring.

### 2. Compatibility & Scalability

- **Backward compatibility** with legacy systems (OCS).
- **Extensibility** to support future instruments/observing modes.

### 3. Cost & Security

- Use **open-source/off-the-shelf components** for cost efficiency.
- **Secure authentication** (e.g., two-factor) and data protection protocols.
- Restrict sensitive operations and data access based on roles.

### 4. Reliability & Testing

- **Integration testing** under real-world operational conditions.
- Ensure no degradation in performance during critical backend operations.

### 5. User Experience

- Interfaces balancing **usability, accessibility, and efficiency**.
- Clear error messages with troubleshooting guidance.
- Design for minimal disruptions during remote operations.

---

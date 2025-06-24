# 💡 Java Advanced Learning

> Dự án học Java nâng cao dành cho lập trình viên có kinh nghiệm 4+ năm, tập trung vào thực chiến, performance, kiến trúc hệ thống, và các công nghệ hiện đại xoay quanh Java.

---

## 🧱 Mục tiêu của repo này

- Làm chủ Java Core & JVM nội bộ
- Thực hành lập trình đa luồng, bất đồng bộ
- Hiểu sâu & sử dụng hiệu quả Spring Ecosystem
- Áp dụng Clean Architecture & Design Patterns
- Viết code chất lượng với test tự động
- Tối ưu hiệu năng hệ thống Java
- Tích hợp CI/CD, Docker, DevOps cơ bản
- Xây dựng hệ thống microservices, cloud-native

---

## 📁 Cấu trúc project

```bash
java_learning/
│
├── core-advanced/             # Java Core nâng cao
├── concurrency/               # Lập trình đa luồng & Concurrency
├── spring-deep-dive/          # Khám phá sâu Spring Framework
├── architecture-design/       # Thiết kế phần mềm & Design Patterns
├── testing-best-practices/    # Testing & Code Quality
├── performance-tuning/        # Tối ưu hiệu năng & profiling
├── devops-ci-cd/              # Docker, CI/CD, DevOps cơ bản
├── distributed-systems/       # Microservices, Kafka, Spring Cloud
├── cloud-deployment/          # Triển khai hệ thống lên Cloud/K8s
└── hands-on-projects/         # Dự án thực chiến tổng hợp
```
## 🛠️  Yêu cầu hệ thống
- **Java 21 trở lên (khuyến nghị Java LTS)**:
- **Maven 3.6+**:
- **Docker (cho một số module)**:
- **Git, Bash/Zsh**:

## 🔍 Tổng quan các module

| Module                     | Mô tả                                                                 |
| -------------------------- | --------------------------------------------------------------------- |
| **core-advanced**          | Java internals, JVM memory, Generics, Reflection, Module system       |
| **concurrency**            | Thread, ExecutorService, CompletableFuture, Reactive programming      |
| **spring-deep-dive**       | Spring IoC, AOP, Boot autoconfig, Security (JWT, OAuth2), Spring Data |
| **architecture-design**    | GoF Design Patterns, SOLID, Clean Architecture, DDD                   |
| **testing-best-practices** | JUnit5, Mockito, Testcontainers, mutation testing                     |
| **performance-tuning**     | GC tuning, memory leak detection, JMH benchmark, VisualVM             |
| **devops-ci-cd**           | Dockerfile, Docker Compose, GitHub Actions, Logging & tracing         |
| **distributed-systems**    | Microservices, Spring Cloud (Config, Gateway, Eureka), Kafka          |
| **cloud-deployment**       | Triển khai app lên AWS, Kubernetes, Helm, autoscaling                 |
| **hands-on-projects**      | Dự án REST API, microservices, observability, resilience, cache       |

## 🚀 Cách sử dụng
1. Clone project
```bash
   git clone https://github.com/yourusername/java_learning.git
   cd java_learning
```
2. Build toàn bộ modules
```bash
  mvn clean install
```
3. Chạy module cụ thể
```bash
cd concurrency
mvn spring-boot:run      # nếu có dùng Spring Boot
# hoặc:
mvn compile exec:java    # cho project thuần Java
```
📌 Mục tiêu học tập

| **Giai đoạn** | **Kỹ năng đạt được**                        |
|---------------| ------------------------------------------- |
| Giai đoạn 1   | Hiểu chuyên sâu Java, Generics, JVM         |
| Giai đoạn 2   | Thành thạo đa luồng, xử lý bất đồng bộ      |
| Giai đoạn 3   | Làm chủ Spring Boot, Spring Security, JPA   |
| Giai đoạn 4   | Viết code sạch, áp dụng design patterns     |
| Giai đoạn 5   | Biết test chuyên nghiệp và tối ưu hiệu năng |
| Giai đoạn 6   | Vận hành và triển khai hệ thống trên Cloud  |

Maintainer
👤 Hung Vuong – [nhthuc-dev](https://github.com/nhthuc-dev)
✉️ Nếu bạn thấy hữu ích, hãy ⭐ repo hoặc đóng góp thêm các module!
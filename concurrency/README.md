
---

### 📁 `concurrency/README.md`

```markdown
# ⚙️ Lập trình Đa luồng & Concurrency

Module này giúp bạn thành thạo lập trình đa luồng và concurrency trong Java.

## ✅ Mục tiêu
- Nắm rõ các API về thread, executor
- Hiểu về memory model, volatile, locks
- Dùng CompletableFuture & ForkJoinPool
- Viết chương trình bất đồng bộ hiệu quả

## 📁 Nội dung
- `threads/` – tạo và quản lý threads
- `executors/` – sử dụng thread pool
- `locks/` – `ReentrantLock`, deadlock demo
- `futures/` – CompletableFuture use cases
- `reactive/` – giới thiệu về Reactor / RxJava

## ▶️ Cách chạy
```bash
mvn clean compile exec:java

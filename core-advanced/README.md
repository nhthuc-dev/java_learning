# 🧠 Java Core Nâng Cao – Giai đoạn 1

> 📍 Mục tiêu: Làm chủ Generics nâng cao, hiểu rõ JVM, Reflection, Annotation và Module system.  
> 📁 Module: `core-advanced/`

---

## 🎯 Mục tiêu học tập

| Chủ đề | Mục tiêu đạt được |
|--------|-------------------|
| ✅ Generics nâng cao | Viết code với bounded types, wildcards, type safety |
| ✅ Reflection API | Tạo & thao tác object runtime, gọi method, inspect field |
| ✅ Custom Annotation | Định nghĩa annotation, xử lý bằng reflection hoặc APT |
| ✅ Java Module System | Biết tạo và sử dụng `module-info.java` |
| ✅ JVM Memory & GC | Hiểu cơ chế phân vùng bộ nhớ JVM, các loại GC |
| ✅ Classloader | Biết cách class được nạp vào JVM và viết custom loader |
| ✅ Bytecode | Dùng `javap` để phân tích bytecode của class |

---

## 📁 Cấu trúc thư mục

```bash
core-advanced/
├── pom.xml
├── generics/
│   └── WildcardExample.java
├── reflection/
│   └── PrivateFieldAccess.java
├── annotations/
│   ├── MyAnnotation.java
│   └── AnnotationProcessorDemo.java
├── modules/
│   ├── module-info.java
│   └── ModularService.java
├── jvm/
│   └── GCMemoryDemo.java
├── classloader/
│   └── CustomClassLoader.java
└── bytecode/
    └── BytecodePrinter.java
```
Cách chạy từng phần
🔹 Biên dịch & chạy toàn bộ
```bash
mvn clean compile exec:java
```
🔹 Với một số ví dụ cần main rõ ràng, bạn có thể dùng -Dexec.mainClass= như sau:

```bash
mvn exec:java -Dexec.mainClass="generics.WildcardExample"
```

Phân tích Bytecode:
```bash
javac bytecode/BytecodePrinter.java
javap -c bytecode/BytecodePrinter
```
## 🧠 Câu hỏi tự kiểm tra
- List<? extends Number> vs List<? super Integer> khác gì?

- Type Erasure là gì và ảnh hưởng ra sao khi dùng Generics?

- Khi nào nên dùng Reflection và nên tránh khi nào?

- Cách tạo annotation với @Retention(RUNTIME) để xử lý bằng Reflection?

- javap dùng để làm gì?

- Các vùng nhớ trong JVM là gì? G1 GC hoạt động như thế nào?


## 💡 Gợi ý nâng cao
- Viết annotation processor thực sự dùng javax.annotation.processing

- Tạo module A sử dụng service từ module B với requires & exports

- Sử dụng ByteBuddy để tạo class runtime (nâng cao hơn Reflection)

## Kết quả kỳ vọng
✅ Hiểu & áp dụng thành thạo Generics, Reflection, Annotations

✅ Có thể phân tích hiệu năng bộ nhớ JVM và tối ưu GC flags

✅ Viết được module Java tách biệt và hiểu rõ classloading

✅ Tự tin với cơ chế hoạt động sâu bên trong của Java


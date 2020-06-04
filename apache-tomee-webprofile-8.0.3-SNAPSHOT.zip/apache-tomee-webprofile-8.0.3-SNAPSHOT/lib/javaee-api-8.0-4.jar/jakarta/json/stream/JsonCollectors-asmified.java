package asm.jakarta.json.stream;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class JsonCollectorsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "jakarta/json/stream/JsonCollectors", null, "java/lang/Object", null);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/util/stream/Collector$Characteristics", "java/util/stream/Collector", "Characteristics", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toJsonArray", "()Ljava/util/stream/Collector;", "()Ljava/util/stream/Collector<Ljakarta/json/JsonValue;Ljakarta/json/JsonArrayBuilder;Ljakarta/json/JsonArray;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("get", "()Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/Json", "createArrayBuilder", "()Ljakarta/json/JsonArrayBuilder;", false), Type.getType("()Ljakarta/json/JsonArrayBuilder;")});
methodVisitor.visitInvokeDynamicInsn("accept", "()Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKEINTERFACE, "jakarta/json/JsonArrayBuilder", "add", "(Ljakarta/json/JsonValue;)Ljakarta/json/JsonArrayBuilder;", true), Type.getType("(Ljakarta/json/JsonArrayBuilder;Ljakarta/json/JsonValue;)V")});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/BinaryOperator;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "jakarta/json/JsonArrayBuilder", "addAll", "(Ljakarta/json/JsonArrayBuilder;)Ljakarta/json/JsonArrayBuilder;", true), Type.getType("(Ljakarta/json/JsonArrayBuilder;Ljakarta/json/JsonArrayBuilder;)Ljakarta/json/JsonArrayBuilder;")});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "jakarta/json/JsonArrayBuilder", "build", "()Ljakarta/json/JsonArray;", true), Type.getType("(Ljakarta/json/JsonArrayBuilder;)Ljakarta/json/JsonArray;")});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/util/stream/Collector$Characteristics");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collector", "of", "(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Ljava/util/stream/Collector$Characteristics;)Ljava/util/stream/Collector;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toJsonObject", "()Ljava/util/stream/Collector;", "()Ljava/util/stream/Collector<Ljava/util/Map$Entry<Ljava/lang/String;Ljakarta/json/JsonValue;>;Ljakarta/json/JsonObjectBuilder;Ljakarta/json/JsonObject;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("get", "()Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/Json", "createObjectBuilder", "()Ljakarta/json/JsonObjectBuilder;", false), Type.getType("()Ljakarta/json/JsonObjectBuilder;")});
methodVisitor.visitInvokeDynamicInsn("accept", "()Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "addEntry", "(Ljakarta/json/JsonObjectBuilder;Ljava/util/Map$Entry;)V", false), Type.getType("(Ljakarta/json/JsonObjectBuilder;Ljava/util/Map$Entry;)V")});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/BinaryOperator;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "addAll", "(Ljakarta/json/JsonObjectBuilder;)Ljakarta/json/JsonObjectBuilder;", true), Type.getType("(Ljakarta/json/JsonObjectBuilder;Ljakarta/json/JsonObjectBuilder;)Ljakarta/json/JsonObjectBuilder;")});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "build", "()Ljakarta/json/JsonObject;", true), Type.getType("(Ljakarta/json/JsonObjectBuilder;)Ljakarta/json/JsonObject;")});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/util/stream/Collector$Characteristics");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collector", "of", "(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Ljava/util/stream/Collector$Characteristics;)Ljava/util/stream/Collector;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toJsonObject", "(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;", "(Ljava/util/function/Function<Ljakarta/json/JsonValue;Ljava/lang/String;>;Ljava/util/function/Function<Ljakarta/json/JsonValue;Ljakarta/json/JsonValue;>;)Ljava/util/stream/Collector<Ljakarta/json/JsonValue;Ljakarta/json/JsonObjectBuilder;Ljakarta/json/JsonObject;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("get", "()Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/Json", "createObjectBuilder", "()Ljakarta/json/JsonObjectBuilder;", false), Type.getType("()Ljakarta/json/JsonObjectBuilder;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "lambda$toJsonObject$0", "(Ljava/util/function/Function;Ljava/util/function/Function;Ljakarta/json/JsonObjectBuilder;Ljakarta/json/JsonValue;)V", false), Type.getType("(Ljakarta/json/JsonObjectBuilder;Ljakarta/json/JsonValue;)V")});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/BinaryOperator;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "addAll", "(Ljakarta/json/JsonObjectBuilder;)Ljakarta/json/JsonObjectBuilder;", true), Type.getType("(Ljakarta/json/JsonObjectBuilder;Ljakarta/json/JsonObjectBuilder;)Ljakarta/json/JsonObjectBuilder;")});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "build", "()Ljakarta/json/JsonObject;", true), Type.getType("(Ljakarta/json/JsonObjectBuilder;)Ljakarta/json/JsonObject;")});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/util/stream/Collector$Characteristics");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collector", "of", "(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Ljava/util/stream/Collector$Characteristics;)Ljava/util/stream/Collector;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "groupingBy", "(Ljava/util/function/Function;Ljava/util/stream/Collector;)Ljava/util/stream/Collector;", "<T::Ljakarta/json/JsonArrayBuilder;>(Ljava/util/function/Function<Ljakarta/json/JsonValue;Ljava/lang/String;>;Ljava/util/stream/Collector<Ljakarta/json/JsonValue;TT;Ljakarta/json/JsonArray;>;)Ljava/util/stream/Collector<Ljakarta/json/JsonValue;Ljava/util/Map<Ljava/lang/String;TT;>;Ljakarta/json/JsonObject;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("get", "()Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false), Type.getType("()Ljava/util/Map;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljava/util/function/Function;Ljava/util/stream/Collector;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "lambda$groupingBy$1", "(Ljava/util/function/Function;Ljava/util/stream/Collector;Ljava/util/Map;Ljakarta/json/JsonValue;)V", false), Type.getType("(Ljava/util/Map;Ljakarta/json/JsonValue;)V")});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/BinaryOperator;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "combiner", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", false), Type.getType("(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;")});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljava/util/stream/Collector;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "lambda$groupingBy$2", "(Ljava/util/stream/Collector;Ljava/util/Map;)Ljakarta/json/JsonObject;", false), Type.getType("(Ljava/util/Map;)Ljakarta/json/JsonObject;")});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/util/stream/Collector$Characteristics");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collector", "of", "(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Ljava/util/stream/Collector$Characteristics;)Ljava/util/stream/Collector;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "groupingBy", "(Ljava/util/function/Function;)Ljava/util/stream/Collector;", "(Ljava/util/function/Function<Ljakarta/json/JsonValue;Ljava/lang/String;>;)Ljava/util/stream/Collector<Ljakarta/json/JsonValue;Ljava/util/Map<Ljava/lang/String;Ljakarta/json/JsonArrayBuilder;>;Ljakarta/json/JsonObject;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "toJsonArray", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "groupingBy", "(Ljava/util/function/Function;Ljava/util/stream/Collector;)Ljava/util/stream/Collector;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "addEntry", "(Ljakarta/json/JsonObjectBuilder;Ljava/util/Map$Entry;)V", "(Ljakarta/json/JsonObjectBuilder;Ljava/util/Map$Entry<Ljava/lang/String;Ljakarta/json/JsonValue;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/JsonValue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "add", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/JsonObjectBuilder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "accumulator", "(Ljava/util/Map;Ljakarta/json/JsonValue;Ljava/util/function/Function;Ljava/util/stream/Collector;)V", "<T::Ljakarta/json/JsonArrayBuilder;>(Ljava/util/Map<Ljava/lang/String;TT;>;Ljakarta/json/JsonValue;Ljava/util/function/Function<Ljakarta/json/JsonValue;Ljava/lang/String;>;Ljava/util/stream/Collector<Ljakarta/json/JsonValue;TT;Ljakarta/json/JsonArray;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljava/util/stream/Collector;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "lambda$accumulator$3", "(Ljava/util/stream/Collector;Ljava/lang/String;)Ljakarta/json/JsonArrayBuilder;", false), Type.getType("(Ljava/lang/String;)Ljakarta/json/JsonArrayBuilder;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "computeIfAbsent", "(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/JsonArrayBuilder");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Collector", "accumulator", "()Ljava/util/function/BiConsumer;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/BiConsumer", "accept", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "combiner", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "<T::Ljakarta/json/JsonArrayBuilder;>(Ljava/util/Map<Ljava/lang/String;TT;>;Ljava/util/Map<Ljava/lang/String;TT;>;)Ljava/util/Map<Ljava/lang/String;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "putAll", "(Ljava/util/Map;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "finisher", "(Ljava/util/Map;Ljava/util/function/Function;)Ljakarta/json/JsonObject;", "<T::Ljakarta/json/JsonArrayBuilder;>(Ljava/util/Map<Ljava/lang/String;TT;>;Ljava/util/function/Function<TT;Ljakarta/json/JsonArray;>;)Ljakarta/json/JsonObject;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/Json", "createObjectBuilder", "()Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljakarta/json/JsonObjectBuilder;Ljava/util/function/Function;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "lambda$finisher$4", "(Ljakarta/json/JsonObjectBuilder;Ljava/util/function/Function;Ljava/lang/String;Ljakarta/json/JsonArrayBuilder;)V", false), Type.getType("(Ljava/lang/String;Ljakarta/json/JsonArrayBuilder;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "build", "()Ljakarta/json/JsonObject;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$finisher$4", "(Ljakarta/json/JsonObjectBuilder;Ljava/util/function/Function;Ljava/lang/String;Ljakarta/json/JsonArrayBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/JsonValue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "add", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/JsonObjectBuilder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$accumulator$3", "(Ljava/util/stream/Collector;Ljava/lang/String;)Ljakarta/json/JsonArrayBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Collector", "supplier", "()Ljava/util/function/Supplier;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Supplier", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/JsonArrayBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$groupingBy$2", "(Ljava/util/stream/Collector;Ljava/util/Map;)Ljakarta/json/JsonObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Collector", "finisher", "()Ljava/util/function/Function;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "finisher", "(Ljava/util/Map;Ljava/util/function/Function;)Ljakarta/json/JsonObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$groupingBy$1", "(Ljava/util/function/Function;Ljava/util/stream/Collector;Ljava/util/Map;Ljakarta/json/JsonValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/stream/JsonCollectors", "accumulator", "(Ljava/util/Map;Ljakarta/json/JsonValue;Ljava/util/function/Function;Ljava/util/stream/Collector;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$toJsonObject$0", "(Ljava/util/function/Function;Ljava/util/function/Function;Ljakarta/json/JsonObjectBuilder;Ljakarta/json/JsonValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/JsonValue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "add", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/JsonObjectBuilder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

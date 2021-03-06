package asm.org.apache.johnzon.core;
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
public class JsonObjectBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/core/JsonObjectBuilderImpl", null, "java/lang/Object", new String[] { "jakarta/json/JsonObjectBuilder", "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/johnzon/core/BufferStrategy$BufferProvider", "org/apache/johnzon/core/BufferStrategy", "BufferProvider", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider<[C>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeMap", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljakarta/json/JsonValue;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/json/JsonObject;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", "(Ljakarta/json/JsonObject;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider<[C>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Map;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider<[C>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/johnzon/core/JsonObjectBuilderImpl", "java/util/Map", "org/apache/johnzon/core/BufferStrategy$BufferProvider", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/json/JsonValue");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/JsonValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/math/BigDecimal");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/math/BigDecimal");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Ljava/math/BigDecimal;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/math/BigInteger");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/math/BigInteger");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Ljava/math/BigInteger;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Boolean");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Z)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Double");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Double");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Double", "doubleValue", "()D", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;D)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Integer");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;I)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Long");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;J)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/String");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "addNull", "(Ljava/lang/String;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Map");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonObjectBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Map;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "<init>", "(Ljava/util/Map;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "build", "()Ljakarta/json/JsonObject;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Collection");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonArrayBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Collection;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonArrayBuilderImpl", "<init>", "(Ljava/util/Collection;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonArrayBuilderImpl", "build", "()Ljakarta/json/JsonArray;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isArray", "()Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/util/ArrayUtil", "newCollection", "(Ljava/lang/Object;)Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonArrayBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonArrayBuilderImpl", "<init>", "(Ljava/util/Collection;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonArrayBuilderImpl", "build", "()Ljakarta/json/JsonArray;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "add", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/json/JsonException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Illegal JSON type! name=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" type=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/JsonException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonStringImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonStringImpl", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljava/math/BigInteger;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonNumberImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/math/BigDecimal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigDecimal", "<init>", "(Ljava/math/BigInteger;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonNumberImpl", "<init>", "(Ljava/math/BigDecimal;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljava/math/BigDecimal;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonNumberImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonNumberImpl", "<init>", "(Ljava/math/BigDecimal;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;I)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonLongImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonLongImpl", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;J)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonLongImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonLongImpl", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;D)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonDoubleImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(DLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonDoubleImpl", "<init>", "(D)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Z)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/JsonValue", "TRUE", "Ljakarta/json/JsonValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/johnzon/core/JsonObjectBuilderImpl", "java/lang/String", Opcodes.INTEGER}, 2, new Object[] {"org/apache/johnzon/core/JsonObjectBuilderImpl", "java/lang/String"});
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/JsonValue", "FALSE", "Ljakarta/json/JsonValue;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/johnzon/core/JsonObjectBuilderImpl", "java/lang/String", Opcodes.INTEGER}, 3, new Object[] {"org/apache/johnzon/core/JsonObjectBuilderImpl", "java/lang/String", "jakarta/json/JsonValue"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNull", "(Ljava/lang/String;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/JsonValue", "NULL", "Ljakarta/json/JsonValue;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljakarta/json/JsonObjectBuilder;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "build", "()Ljakarta/json/JsonObject;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljakarta/json/JsonArrayBuilder;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/JsonArrayBuilder", "build", "()Ljakarta/json/JsonArray;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectBuilderImpl", "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addAll", "(Ljakarta/json/JsonObjectBuilder;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/JsonObjectBuilder", "build", "()Ljakarta/json/JsonObject;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "putAll", "(Ljava/util/Map;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/String;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "putValue", "(Ljava/lang/String;Ljakarta/json/JsonValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("name or value/builder must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Ljakarta/json/JsonObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/JsonValue", "EMPTY_JSON_OBJECT", "Ljakarta/json/JsonObject;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonObjectImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonObjectBuilderImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonObjectImpl", "<init>", "(Ljava/util/Map;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

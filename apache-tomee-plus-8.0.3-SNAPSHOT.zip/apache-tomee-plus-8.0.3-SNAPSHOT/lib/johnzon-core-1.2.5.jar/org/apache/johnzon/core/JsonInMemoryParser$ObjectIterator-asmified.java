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
public class JsonInMemoryParser$ObjectIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "Ljava/lang/Object;Ljava/util/Iterator<Ljavax/json/stream/JsonParser$Event;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "org/apache/johnzon/core/JsonInMemoryParser", "ObjectIterator", ACC_PRIVATE);

classWriter.visitInnerClass("javax/json/stream/JsonParser$Event", "javax/json/stream/JsonParser", "Event", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/json/JsonValue$ValueType", "javax/json/JsonValue", "ValueType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/johnzon/core/JsonInMemoryParser$ArrayIterator", "org/apache/johnzon/core/JsonInMemoryParser", "ArrayIterator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "oentries", "Ljava/util/Iterator;", "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljavax/json/JsonValue;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jsonValue", "Ljavax/json/JsonValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "end", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/johnzon/core/JsonInMemoryParser;Ljavax/json/JsonObject;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "end", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonObject", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "oentries", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "end", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljavax/json/stream/JsonParser$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "end", "Ljava/lang/Boolean;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "end", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "START_OBJECT", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "oentries", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$000", "(Lorg/apache/johnzon/core/JsonInMemoryParser;)Lorg/apache/johnzon/core/SimpleStack;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/SimpleStack", "isEmpty", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$000", "(Lorg/apache/johnzon/core/JsonInMemoryParser;)Lorg/apache/johnzon/core/SimpleStack;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/SimpleStack", "pop", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "end", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "END_OBJECT", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "oentries", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonStringImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonStringImpl", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$102", "(Lorg/apache/johnzon/core/JsonInMemoryParser;Ljavax/json/JsonValue;)Ljavax/json/JsonValue;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "KEY_NAME", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonValue", "getValueType", "()Ljavax/json/JsonValue$ValueType;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "OBJECT", "Ljavax/json/JsonValue$ValueType;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$000", "(Lorg/apache/johnzon/core/JsonInMemoryParser;)Lorg/apache/johnzon/core/SimpleStack;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonObject");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "<init>", "(Lorg/apache/johnzon/core/JsonInMemoryParser;Ljavax/json/JsonObject;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/SimpleStack", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$000", "(Lorg/apache/johnzon/core/JsonInMemoryParser;)Lorg/apache/johnzon/core/SimpleStack;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/SimpleStack", "peek", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Iterator");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/stream/JsonParser$Event");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/json/JsonValue$ValueType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue$ValueType", "ARRAY", "Ljavax/json/JsonValue$ValueType;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$000", "(Lorg/apache/johnzon/core/JsonInMemoryParser;)Lorg/apache/johnzon/core/SimpleStack;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonInMemoryParser$ArrayIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonArray");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonInMemoryParser$ArrayIterator", "<init>", "(Lorg/apache/johnzon/core/JsonInMemoryParser;Ljavax/json/JsonArray;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/SimpleStack", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$000", "(Lorg/apache/johnzon/core/JsonInMemoryParser;)Lorg/apache/johnzon/core/SimpleStack;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/SimpleStack", "peek", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Iterator");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/stream/JsonParser$Event");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$200", "(Ljavax/json/JsonValue$ValueType;)Ljavax/json/stream/JsonParser$Event;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "this$0", "Lorg/apache/johnzon/core/JsonInMemoryParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonInMemoryParser", "access$102", "(Lorg/apache/johnzon/core/JsonInMemoryParser;Ljavax/json/JsonValue;)Ljavax/json/JsonValue;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "jsonValue", "Ljavax/json/JsonValue;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonInMemoryParser$ObjectIterator", "next", "()Ljavax/json/stream/JsonParser$Event;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

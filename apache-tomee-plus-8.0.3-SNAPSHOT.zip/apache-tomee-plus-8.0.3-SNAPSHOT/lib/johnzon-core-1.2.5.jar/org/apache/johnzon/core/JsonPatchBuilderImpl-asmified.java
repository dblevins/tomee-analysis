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
public class JsonPatchBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/core/JsonPatchBuilderImpl", null, "java/lang/Object", new String[] { "javax/json/JsonPatchBuilder" });

classWriter.visitInnerClass("org/apache/johnzon/core/JsonPatchImpl$PatchValue", "org/apache/johnzon/core/JsonPatchImpl", "PatchValue", ACC_STATIC);

classWriter.visitInnerClass("javax/json/JsonPatch$Operation", "javax/json/JsonPatch", "Operation", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "provider", "Ljavax/json/spi/JsonProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "operations", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/johnzon/core/JsonPatchImpl$PatchValue;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/json/spi/JsonProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "operations", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/json/spi/JsonProvider;Ljavax/json/JsonArray;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonArray", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "operations", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonArray", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/johnzon/core/JsonPatchBuilderImpl", "javax/json/spi/JsonProvider", "javax/json/JsonArray", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonValue");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonObject");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("op");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonObject", "getString", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/JsonPatch$Operation", "fromOperationName", "(Ljava/lang/String;)Ljavax/json/JsonPatch$Operation;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("path");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonObject", "getString", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("from");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonObject", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonObject", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonValue");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "operations", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonPatchImpl$PatchValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchImpl$PatchValue", "<init>", "(Ljavax/json/spi/JsonProvider;Ljavax/json/JsonPatch$Operation;Ljava/lang/String;Ljava/lang/String;Ljavax/json/JsonValue;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonPatchImpl$PatchValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "ADD", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchImpl$PatchValue", "<init>", "(Ljavax/json/spi/JsonProvider;Ljavax/json/JsonPatch$Operation;Ljava/lang/String;Ljava/lang/String;Ljavax/json/JsonValue;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "addOperation", "(Lorg/apache/johnzon/core/JsonPatchImpl$PatchValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonString", "(Ljava/lang/String;)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "add", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;I)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonNumber", "(I)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "add", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/String;Z)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonBoolean", "(Z)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "add", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/String;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonPatchImpl$PatchValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "REMOVE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchImpl$PatchValue", "<init>", "(Ljavax/json/spi/JsonProvider;Ljavax/json/JsonPatch$Operation;Ljava/lang/String;Ljava/lang/String;Ljavax/json/JsonValue;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "addOperation", "(Lorg/apache/johnzon/core/JsonPatchImpl$PatchValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replace", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonPatchImpl$PatchValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "REPLACE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchImpl$PatchValue", "<init>", "(Ljavax/json/spi/JsonProvider;Ljavax/json/JsonPatch$Operation;Ljava/lang/String;Ljava/lang/String;Ljavax/json/JsonValue;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "addOperation", "(Lorg/apache/johnzon/core/JsonPatchImpl$PatchValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replace", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonString", "(Ljava/lang/String;)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "replace", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replace", "(Ljava/lang/String;I)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonNumber", "(I)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "replace", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replace", "(Ljava/lang/String;Z)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonBoolean", "(Z)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "replace", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "move", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonPatchImpl$PatchValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "MOVE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchImpl$PatchValue", "<init>", "(Ljavax/json/spi/JsonProvider;Ljavax/json/JsonPatch$Operation;Ljava/lang/String;Ljava/lang/String;Ljavax/json/JsonValue;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "addOperation", "(Lorg/apache/johnzon/core/JsonPatchImpl$PatchValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonPatchImpl$PatchValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "COPY", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchImpl$PatchValue", "<init>", "(Ljavax/json/spi/JsonProvider;Ljavax/json/JsonPatch$Operation;Ljava/lang/String;Ljava/lang/String;Ljavax/json/JsonValue;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "addOperation", "(Lorg/apache/johnzon/core/JsonPatchImpl$PatchValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "test", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonPatchImpl$PatchValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "TEST", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchImpl$PatchValue", "<init>", "(Ljavax/json/spi/JsonProvider;Ljavax/json/JsonPatch$Operation;Ljava/lang/String;Ljava/lang/String;Ljavax/json/JsonValue;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "addOperation", "(Lorg/apache/johnzon/core/JsonPatchImpl$PatchValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "test", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonString", "(Ljava/lang/String;)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "test", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "test", "(Ljava/lang/String;I)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonNumber", "(I)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "test", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "test", "(Ljava/lang/String;Z)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/core/JsonPatchBuilderImpl", "toJsonBoolean", "(Z)Ljavax/json/JsonValue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonPatchBuilderImpl", "test", "(Ljava/lang/String;Ljavax/json/JsonValue;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Ljavax/json/JsonPatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonPatchImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "provider", "Ljavax/json/spi/JsonProvider;");
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "operations", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonPatchImpl", "<init>", "(Ljavax/json/spi/JsonProvider;Ljava/util/List;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addOperation", "(Lorg/apache/johnzon/core/JsonPatchImpl$PatchValue;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonPatchBuilderImpl", "operations", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "toJsonBoolean", "(Z)Ljavax/json/JsonValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue", "TRUE", "Ljavax/json/JsonValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue", "FALSE", "Ljavax/json/JsonValue;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/json/JsonValue"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "toJsonString", "(Ljava/lang/String;)Ljavax/json/JsonValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonValue", "NULL", "Ljavax/json/JsonValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonStringImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonStringImpl", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/json/JsonValue"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "toJsonNumber", "(I)Ljavax/json/JsonValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonLongImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonLongImpl", "<init>", "(J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

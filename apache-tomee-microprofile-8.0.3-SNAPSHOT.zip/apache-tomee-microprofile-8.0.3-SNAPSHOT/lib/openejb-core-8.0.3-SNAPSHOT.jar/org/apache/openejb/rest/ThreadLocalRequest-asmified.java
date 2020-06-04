package asm.org.apache.openejb.rest;
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
public class ThreadLocalRequestDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/rest/ThreadLocalRequest", "Lorg/apache/openejb/rest/AbstractRestThreadLocalProxy<Ljavax/ws/rs/core/Request;>;Ljavax/ws/rs/core/Request;", "org/apache/openejb/rest/AbstractRestThreadLocalProxy", new String[] { "javax/ws/rs/core/Request" });

classWriter.visitInnerClass("javax/ws/rs/core/Response$ResponseBuilder", "javax/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Request;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/AbstractRestThreadLocalProxy", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluatePreconditions", "(Ljavax/ws/rs/core/EntityTag;)Ljavax/ws/rs/core/Response$ResponseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalRequest", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/core/Request");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Request", "evaluatePreconditions", "(Ljavax/ws/rs/core/EntityTag;)Ljavax/ws/rs/core/Response$ResponseBuilder;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluatePreconditions", "(Ljava/util/Date;)Ljavax/ws/rs/core/Response$ResponseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalRequest", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/core/Request");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Request", "evaluatePreconditions", "(Ljava/util/Date;)Ljavax/ws/rs/core/Response$ResponseBuilder;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluatePreconditions", "(Ljava/util/Date;Ljavax/ws/rs/core/EntityTag;)Ljavax/ws/rs/core/Response$ResponseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalRequest", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/core/Request");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Request", "evaluatePreconditions", "(Ljava/util/Date;Ljavax/ws/rs/core/EntityTag;)Ljavax/ws/rs/core/Response$ResponseBuilder;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectVariant", "(Ljava/util/List;)Ljavax/ws/rs/core/Variant;", "(Ljava/util/List<Ljavax/ws/rs/core/Variant;>;)Ljavax/ws/rs/core/Variant;", new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalRequest", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/core/Request");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Request", "selectVariant", "(Ljava/util/List;)Ljavax/ws/rs/core/Variant;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethod", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalRequest", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/core/Request");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Request", "getMethod", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluatePreconditions", "()Ljavax/ws/rs/core/Response$ResponseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalRequest", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/core/Request");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Request", "evaluatePreconditions", "()Ljavax/ws/rs/core/Response$ResponseBuilder;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

package asm.org.apache.tomee.microprofile.jwt;
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
public class MPJWTFilter$MPJWTExceptionMapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTExceptionMapper", "Ljava/lang/Object;Ljavax/ws/rs/ext/ExceptionMapper<Lorg/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTException;>;", "java/lang/Object", new String[] { "javax/ws/rs/ext/ExceptionMapper" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/ext/Provider;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTExceptionMapper", "org/apache/tomee/microprofile/jwt/MPJWTFilter", "MPJWTExceptionMapper", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTException", "org/apache/tomee/microprofile/jwt/MPJWTFilter", "MPJWTException", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("javax/ws/rs/core/Response$ResponseBuilder", "javax/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toResponse", "(Lorg/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTException;)Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTException", "getStatus", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(I)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "entity", "(Ljava/lang/Object;)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "toResponse", "(Ljava/lang/Throwable;)Ljavax/ws/rs/core/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTExceptionMapper", "toResponse", "(Lorg/apache/tomee/microprofile/jwt/MPJWTFilter$MPJWTException;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

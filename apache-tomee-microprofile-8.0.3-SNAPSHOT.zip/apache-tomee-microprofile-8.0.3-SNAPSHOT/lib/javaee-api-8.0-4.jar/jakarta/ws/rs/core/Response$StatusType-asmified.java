package asm.jakarta.ws.rs.core;
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
public class Response$StatusTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/ws/rs/core/Response$StatusType", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status", "jakarta/ws/rs/core/Response", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status$Family", "jakarta/ws/rs/core/Response$Status", "Family", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$StatusType", "jakarta/ws/rs/core/Response", "StatusType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStatusCode", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFamily", "()Ljakarta/ws/rs/core/Response$Status$Family;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getReasonPhrase", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toEnum", "()Ljakarta/ws/rs/core/Response$Status;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/Response$StatusType", "getStatusCode", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response$Status", "fromStatusCode", "(I)Ljakarta/ws/rs/core/Response$Status;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

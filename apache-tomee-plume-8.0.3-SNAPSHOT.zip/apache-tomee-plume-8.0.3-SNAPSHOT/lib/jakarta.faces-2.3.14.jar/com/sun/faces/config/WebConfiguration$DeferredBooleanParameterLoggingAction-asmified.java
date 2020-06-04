package asm.com.sun.faces.config;
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
public class WebConfiguration$DeferredBooleanParameterLoggingActionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", null, "java/lang/Object", new String[] { "com/sun/faces/config/WebConfiguration$DeferredLoggingAction" });

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "com/sun/faces/config/WebConfiguration", "BooleanWebContextInitParameter", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "com/sun/faces/config/WebConfiguration", "DeferredBooleanParameterLoggingAction", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy", "com/sun/faces/config/WebConfiguration", "DeprecationLoggingStrategy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$DeferredLoggingAction", "com/sun/faces/config/WebConfiguration", "DeferredLoggingAction", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameter", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "loggingLevel", "Ljava/util/logging/Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "logKey", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "params", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/config/WebConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/config/WebConfiguration;Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "this$0", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "parameter", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "loggingLevel", "Ljava/util/logging/Level;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "logKey", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "params", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "log", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/WebConfiguration", "access$500", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "loggingLevel", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "parameter", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "getDeprecationLoggingStrategy", "()Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "this$0", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy", "shouldBeLogged", "(Lcom/sun/faces/config/WebConfiguration;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/WebConfiguration", "access$500", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "loggingLevel", "Ljava/util/logging/Level;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "logKey", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$DeferredBooleanParameterLoggingAction", "params", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

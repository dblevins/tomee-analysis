package asm.org.apache.openejb.server.httpd;
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
public class EEFilter$AsynContextWrapper$ScopeAwareListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", null, "java/lang/Object", new String[] { "jakarta/servlet/AsyncListener" });

classWriter.visitInnerClass("org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "org/apache/openejb/server/httpd/EEFilter", "AsynContextWrapper", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "ScopeAwareListener", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljakarta/servlet/AsyncListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;Ljakarta/servlet/AsyncListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "delegate", "Ljakarta/servlet/AsyncListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onComplete", "(Ljakarta/servlet/AsyncEvent;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$100", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "delegate", "Ljakarta/servlet/AsyncListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/AsyncListener", "onComplete", "(Ljakarta/servlet/AsyncEvent;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$200", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "jakarta/servlet/AsyncEvent", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$200", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onTimeout", "(Ljakarta/servlet/AsyncEvent;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$100", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "delegate", "Ljakarta/servlet/AsyncListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/AsyncListener", "onTimeout", "(Ljakarta/servlet/AsyncEvent;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$200", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "jakarta/servlet/AsyncEvent", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$200", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onError", "(Ljakarta/servlet/AsyncEvent;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$100", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "delegate", "Ljakarta/servlet/AsyncListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/AsyncListener", "onError", "(Ljakarta/servlet/AsyncEvent;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$200", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "jakarta/servlet/AsyncEvent", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$200", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onStartAsync", "(Ljakarta/servlet/AsyncEvent;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$100", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "delegate", "Ljakarta/servlet/AsyncListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/AsyncListener", "onStartAsync", "(Ljakarta/servlet/AsyncEvent;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$200", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "jakarta/servlet/AsyncEvent", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper$ScopeAwareListener", "this$0", "Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/httpd/EEFilter$AsynContextWrapper", "access$200", "(Lorg/apache/openejb/server/httpd/EEFilter$AsynContextWrapper;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

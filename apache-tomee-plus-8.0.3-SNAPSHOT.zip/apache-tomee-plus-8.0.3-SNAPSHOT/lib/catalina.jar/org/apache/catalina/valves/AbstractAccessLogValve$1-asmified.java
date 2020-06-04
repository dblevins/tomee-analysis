package asm.org.apache.catalina.valves;
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
public class AbstractAccessLogValve$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/catalina/valves/AbstractAccessLogValve$1", "Ljava/lang/ThreadLocal<Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;>;", "java/lang/ThreadLocal", null);

classWriter.visitOuterClass("org/apache/catalina/valves/AbstractAccessLogValve", null, null);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache", "org/apache/catalina/valves/AbstractAccessLogValve", "DateFormatCache", ACC_PROTECTED | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialValue", "()Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getDefault", "()Ljava/util/Locale;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "access$500", "()Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache", "<init>", "(ILjava/util/Locale;Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "initialValue", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve$1", "initialValue", "()Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

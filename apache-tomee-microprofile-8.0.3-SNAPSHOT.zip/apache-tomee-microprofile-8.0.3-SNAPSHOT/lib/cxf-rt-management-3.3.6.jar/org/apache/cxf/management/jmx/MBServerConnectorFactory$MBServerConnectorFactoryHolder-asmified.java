package asm.org.apache.cxf.management.jmx;
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
public class MBServerConnectorFactory$MBServerConnectorFactoryHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/management/jmx/MBServerConnectorFactory$MBServerConnectorFactoryHolder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/management/jmx/MBServerConnectorFactory$MBServerConnectorFactoryHolder", "org/apache/cxf/management/jmx/MBServerConnectorFactory", "MBServerConnectorFactoryHolder", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/management/jmx/MBServerConnectorFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;", null, null);
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory$MBServerConnectorFactoryHolder", "INSTANCE", "Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/management/jmx/MBServerConnectorFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/management/jmx/MBServerConnectorFactory", "<init>", "(Lorg/apache/cxf/management/jmx/MBServerConnectorFactory$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/management/jmx/MBServerConnectorFactory$MBServerConnectorFactoryHolder", "INSTANCE", "Lorg/apache/cxf/management/jmx/MBServerConnectorFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

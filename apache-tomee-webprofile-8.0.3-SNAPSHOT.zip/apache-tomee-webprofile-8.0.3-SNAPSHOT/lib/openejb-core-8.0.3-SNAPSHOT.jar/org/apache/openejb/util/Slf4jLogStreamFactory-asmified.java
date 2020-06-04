package asm.org.apache.openejb.util;
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
public class Slf4jLogStreamFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/util/Slf4jLogStreamFactory", null, "java/lang/Object", new String[] { "org/apache/openejb/util/LogStreamFactory" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createLogStream", "(Lorg/apache/openejb/util/LogCategory;)Lorg/apache/openejb/util/LogStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/Slf4jLogStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Slf4jLogStream", "<init>", "(Lorg/apache/openejb/util/LogCategory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitLdcInsn("openjpa.Log");
methodVisitor.visitLdcInsn("slf4j");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/JavaSecurityManagers", "setSystemProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLdcInsn("org.apache.cxf.Logger");
methodVisitor.visitLdcInsn("org.apache.cxf.common.logging.Slf4jLogger");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/JavaSecurityManagers", "setSystemProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLdcInsn("openwebbeans.logging.factory");
methodVisitor.visitLdcInsn("org.apache.openejb.cdi.logging.Slf4jLoggerFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/JavaSecurityManagers", "setSystemProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

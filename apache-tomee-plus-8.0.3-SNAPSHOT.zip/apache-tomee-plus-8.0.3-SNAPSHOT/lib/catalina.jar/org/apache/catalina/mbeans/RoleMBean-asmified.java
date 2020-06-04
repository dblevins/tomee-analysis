package asm.org.apache.catalina.mbeans;
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
public class RoleMBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/mbeans/RoleMBean", null, "org/apache/tomcat/util/modeler/BaseModelMBean", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "registry", "Lorg/apache/tomcat/util/modeler/Registry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "managed", "Lorg/apache/tomcat/util/modeler/ManagedBean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/modeler/BaseModelMBean", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/mbeans/MBeanUtils", "createRegistry", "()Lorg/apache/tomcat/util/modeler/Registry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mbeans/RoleMBean", "registry", "Lorg/apache/tomcat/util/modeler/Registry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/mbeans/RoleMBean", "registry", "Lorg/apache/tomcat/util/modeler/Registry;");
methodVisitor.visitLdcInsn("Role");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/modeler/Registry", "findManagedBean", "(Ljava/lang/String;)Lorg/apache/tomcat/util/modeler/ManagedBean;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mbeans/RoleMBean", "managed", "Lorg/apache/tomcat/util/modeler/ManagedBean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

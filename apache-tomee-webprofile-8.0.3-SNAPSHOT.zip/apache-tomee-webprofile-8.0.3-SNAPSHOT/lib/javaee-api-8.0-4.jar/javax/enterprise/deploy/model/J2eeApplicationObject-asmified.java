package asm.javax.enterprise.deploy.model;
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
public class J2eeApplicationObjectDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/deploy/model/J2eeApplicationObject", null, "java/lang/Object", new String[] { "javax/enterprise/deploy/model/DeployableObject" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeployableObject", "(Ljava/lang/String;)Ljavax/enterprise/deploy/model/DeployableObject;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeployableObjects", "(Ljavax/enterprise/deploy/shared/ModuleType;)[Ljavax/enterprise/deploy/model/DeployableObject;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeployableObjects", "()[Ljavax/enterprise/deploy/model/DeployableObject;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getModuleUris", "(Ljavax/enterprise/deploy/shared/ModuleType;)[Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getModuleUris", "()[Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChildBean", "(Ljavax/enterprise/deploy/shared/ModuleType;Ljava/lang/String;)[Ljavax/enterprise/deploy/model/DDBean;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getText", "(Ljavax/enterprise/deploy/shared/ModuleType;Ljava/lang/String;)[Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addXpathListener", "(Ljavax/enterprise/deploy/shared/ModuleType;Ljava/lang/String;Ljavax/enterprise/deploy/model/XpathListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeXpathListener", "(Ljavax/enterprise/deploy/shared/ModuleType;Ljava/lang/String;Ljavax/enterprise/deploy/model/XpathListener;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

package asm.javax.xml.registry;
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
public class RegistryServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/xml/registry/RegistryService", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBulkResponse", "(Ljava/lang/String;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/InvalidRequestException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBusinessLifeCycleManager", "()Ljavax/xml/registry/BusinessLifeCycleManager;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBusinessQueryManager", "()Ljavax/xml/registry/BusinessQueryManager;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCapabilityProfile", "()Ljavax/xml/registry/CapabilityProfile;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclarativeQueryManager", "()Ljavax/xml/registry/DeclarativeQueryManager;", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/UnsupportedCapabilityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultPostalScheme", "()Ljavax/xml/registry/infomodel/ClassificationScheme;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "makeRegistrySpecificRequest", "(Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

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
public class BusinessLifeCycleManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/xml/registry/BusinessLifeCycleManager", null, "java/lang/Object", new String[] { "javax/xml/registry/LifeCycleManager" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "confirmAssociation", "(Ljavax/xml/registry/infomodel/Association;)V", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/InvalidRequestException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteAssociations", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteClassificationSchemes", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteConcepts", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteOrganizations", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteServiceBindings", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteServices", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "saveAssociations", "(Ljava/util/Collection;Z)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "saveClassificationSchemes", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "saveConcepts", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "saveOrganizations", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "saveServiceBindings", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "saveServices", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unConfirmAssociation", "(Ljavax/xml/registry/infomodel/Association;)V", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/InvalidRequestException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

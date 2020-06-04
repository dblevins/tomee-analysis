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
public class LifeCycleManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/xml/registry/LifeCycleManager", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSOCIATION", "Ljava/lang/String;", null, "Association");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUDITABLE_EVENT", "Ljava/lang/String;", null, "AuditableEvent");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASSIFICATION", "Ljava/lang/String;", null, "Classification");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASSIFICATION_SCHEME", "Ljava/lang/String;", null, "ClassificationScheme");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONCEPT", "Ljava/lang/String;", null, "Concept");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMAIL_ADDRESS", "Ljava/lang/String;", null, "EmailAddress");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXTERNAL_IDENTIFIER", "Ljava/lang/String;", null, "ExternalIdentifier");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXTERNAL_LINK", "Ljava/lang/String;", null, "ExternalLink");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXTRINSIC_OBJECT", "Ljava/lang/String;", null, "ExtrinsicObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTERNATIONAL_STRING", "Ljava/lang/String;", null, "InternationalString");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY", "Ljava/lang/String;", null, "Key");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOCALIZED_STRING", "Ljava/lang/String;", null, "LocalizedString");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORGANIZATION", "Ljava/lang/String;", null, "Organization");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERSON_NAME", "Ljava/lang/String;", null, "PersonName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POSTAL_ADDRESS", "Ljava/lang/String;", null, "PostalAddress");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGISTRY_ENTRY", "Ljava/lang/String;", null, "RegistryEntry");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REGISTRY_PACKAGE", "Ljava/lang/String;", null, "RegistryPackage");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVICE", "Ljava/lang/String;", null, "Service");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVICE_BINDING", "Ljava/lang/String;", null, "ServiceBinding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SLOT", "Ljava/lang/String;", null, "Slot");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPECIFICATION_LINK", "Ljava/lang/String;", null, "SpecificationLink");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TELEPHONE_NUMBER", "Ljava/lang/String;", null, "TelephoneNumber");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER", "Ljava/lang/String;", null, "User");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERSIONABLE", "Ljava/lang/String;", null, "Versionable");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createAssociation", "(Ljavax/xml/registry/infomodel/RegistryObject;Ljavax/xml/registry/infomodel/Concept;)Ljavax/xml/registry/infomodel/Association;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createClassification", "(Ljavax/xml/registry/infomodel/ClassificationScheme;Ljavax/xml/registry/infomodel/InternationalString;Ljava/lang/String;)Ljavax/xml/registry/infomodel/Classification;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createClassification", "(Ljavax/xml/registry/infomodel/ClassificationScheme;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/Classification;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createClassification", "(Ljavax/xml/registry/infomodel/Concept;)Ljavax/xml/registry/infomodel/Classification;", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/InvalidRequestException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createClassificationScheme", "(Ljavax/xml/registry/infomodel/Concept;)Ljavax/xml/registry/infomodel/ClassificationScheme;", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/InvalidRequestException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createClassificationScheme", "(Ljavax/xml/registry/infomodel/InternationalString;Ljavax/xml/registry/infomodel/InternationalString;)Ljavax/xml/registry/infomodel/ClassificationScheme;", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/InvalidRequestException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createClassificationScheme", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/ClassificationScheme;", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/InvalidRequestException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConcept", "(Ljavax/xml/registry/infomodel/RegistryObject;Ljavax/xml/registry/infomodel/InternationalString;Ljava/lang/String;)Ljavax/xml/registry/infomodel/Concept;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConcept", "(Ljavax/xml/registry/infomodel/RegistryObject;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/Concept;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createEmailAddress", "(Ljava/lang/String;)Ljavax/xml/registry/infomodel/EmailAddress;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createEmailAddress", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/EmailAddress;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createExternalIdentifier", "(Ljavax/xml/registry/infomodel/ClassificationScheme;Ljavax/xml/registry/infomodel/InternationalString;Ljava/lang/String;)Ljavax/xml/registry/infomodel/ExternalIdentifier;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createExternalIdentifier", "(Ljavax/xml/registry/infomodel/ClassificationScheme;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/ExternalIdentifier;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createExternalLink", "(Ljava/lang/String;Ljavax/xml/registry/infomodel/InternationalString;)Ljavax/xml/registry/infomodel/ExternalLink;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createExternalLink", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/ExternalLink;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createExtrinsicObject", "(Ljavax/activation/DataHandler;)Ljavax/xml/registry/infomodel/ExtrinsicObject;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInternationalString", "()Ljavax/xml/registry/infomodel/InternationalString;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInternationalString", "(Ljava/util/Locale;Ljava/lang/String;)Ljavax/xml/registry/infomodel/InternationalString;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInternationalString", "(Ljava/lang/String;)Ljavax/xml/registry/infomodel/InternationalString;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createKey", "(Ljava/lang/String;)Ljavax/xml/registry/infomodel/Key;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createLocalizedString", "(Ljava/util/Locale;Ljava/lang/String;)Ljavax/xml/registry/infomodel/LocalizedString;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createLocalizedString", "(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/LocalizedString;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createObject", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/xml/registry/JAXRException", "javax/xml/registry/InvalidRequestException", "javax/xml/registry/UnsupportedCapabilityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createOrganization", "(Ljavax/xml/registry/infomodel/InternationalString;)Ljavax/xml/registry/infomodel/Organization;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createOrganization", "(Ljava/lang/String;)Ljavax/xml/registry/infomodel/Organization;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createPersonName", "(Ljava/lang/String;)Ljavax/xml/registry/infomodel/PersonName;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createPersonName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/PersonName;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createPostalAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/PostalAddress;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createRegistryPackage", "(Ljavax/xml/registry/infomodel/InternationalString;)Ljavax/xml/registry/infomodel/RegistryPackage;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createRegistryPackage", "(Ljava/lang/String;)Ljavax/xml/registry/infomodel/RegistryPackage;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createService", "(Ljavax/xml/registry/infomodel/InternationalString;)Ljavax/xml/registry/infomodel/Service;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createService", "(Ljava/lang/String;)Ljavax/xml/registry/infomodel/Service;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createServiceBinding", "()Ljavax/xml/registry/infomodel/ServiceBinding;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSlot", "(Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;)Ljavax/xml/registry/infomodel/Slot;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSlot", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/registry/infomodel/Slot;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSpecificationLink", "()Ljavax/xml/registry/infomodel/SpecificationLink;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTelephoneNumber", "()Ljavax/xml/registry/infomodel/TelephoneNumber;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createUser", "()Ljavax/xml/registry/infomodel/User;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteObjects", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteObjects", "(Ljava/util/Collection;Ljava/lang/String;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deprecateObjects", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRegistryService", "()Ljavax/xml/registry/RegistryService;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "saveObjects", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unDeprecateObjects", "(Ljava/util/Collection;)Ljavax/xml/registry/BulkResponse;", null, new String[] { "javax/xml/registry/JAXRException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

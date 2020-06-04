package asm.org.apache.openejb.jee.oejb2;
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
public class ObjectFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/jee/oejb2/ObjectFactory", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlRegistry;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/GroupType$CmrField", "org/apache/openejb/jee/oejb2/GroupType", "CmrField", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/QueryType$QueryMethod", "org/apache/openejb/jee/oejb2/QueryType", "QueryMethod", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/EntityBeanType$Cache", "org/apache/openejb/jee/oejb2/EntityBeanType", "Cache", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$CmrField", "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType", "CmrField", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/EntityBeanType$PrefetchGroup", "org/apache/openejb/jee/oejb2/EntityBeanType", "PrefetchGroup", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RelationshipRoleSource", "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType", "RelationshipRoleSource", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping", "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType", "RoleMapping", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping$CmrFieldMapping", "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping", "CmrFieldMapping", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/EntityBeanType$CmpFieldMapping", "org/apache/openejb/jee/oejb2/EntityBeanType", "CmpFieldMapping", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/oejb2/QueryType$QueryMethod$MethodParams", "org/apache/openejb/jee/oejb2/QueryType$QueryMethod", "MethodParams", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_GbeanTypeReferences_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_GbeanTypeXmlReference_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_GbeanTypeDependency_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_GbeanTypeAttribute_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_GbeanTypeReference_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_GbeanTypeXmlAttribute_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ResourceEnvRef_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ResourceRef_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EntityManagerFactoryRef_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_AbstractNamingEntry_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Dependencies_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Application_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_MessageDestination_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Module_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Clustering_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_KeyGenerator_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Environment_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Security_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Security2_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ResourceAdapter_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EjbLocalRef_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ServerEnvironment_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Service_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Gbean_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Workmanager_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ServiceRef_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_CmpConnectionFactory_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ClientEnvironment_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_GbeanRef_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_OpenejbJar_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EjbRef_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_WebContainer_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_OpenejbClusteringWadi_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EjbJar_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createActivationConfigPropertyType", "()Lorg/apache/openejb/jee/oejb2/ActivationConfigPropertyType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ActivationConfigPropertyType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ActivationConfigPropertyType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAutoIncrementTableType", "()Lorg/apache/openejb/jee/oejb2/AutoIncrementTableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/AutoIncrementTableType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/AutoIncrementTableType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGroupTypeCmrField", "()Lorg/apache/openejb/jee/oejb2/GroupType$CmrField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/GroupType$CmrField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/GroupType$CmrField", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEnvironmentType", "()Lorg/apache/openejb/jee/oejb2/EnvironmentType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EnvironmentType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EnvironmentType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReferencesType", "()Lorg/apache/openejb/jee/oejb2/ReferencesType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ReferencesType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ReferencesType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQueryTypeQueryMethod", "()Lorg/apache/openejb/jee/oejb2/QueryType$QueryMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/QueryType$QueryMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/QueryType$QueryMethod", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createClassFilterType", "()Lorg/apache/openejb/jee/oejb2/ClassFilterType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ClassFilterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ClassFilterType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityBeanTypeCache", "()Lorg/apache/openejb/jee/oejb2/EntityBeanType$Cache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EntityBeanType$Cache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EntityBeanType$Cache", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createXmlAttributeType", "()Lorg/apache/openejb/jee/oejb2/XmlAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/XmlAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/XmlAttributeType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbRelationType", "()Lorg/apache/openejb/jee/oejb2/EjbRelationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EjbRelationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EjbRelationType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGroupType", "()Lorg/apache/openejb/jee/oejb2/GroupType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/GroupType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/GroupType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSequenceTableType", "()Lorg/apache/openejb/jee/oejb2/SequenceTableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/SequenceTableType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/SequenceTableType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCmpFieldGroupMappingType", "()Lorg/apache/openejb/jee/oejb2/CmpFieldGroupMappingType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/CmpFieldGroupMappingType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/CmpFieldGroupMappingType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createPersistenceUnitRefType", "()Lorg/apache/openejb/jee/oejb2/PersistenceUnitRefType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/PersistenceUnitRefType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/PersistenceUnitRefType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSqlGeneratorType", "()Lorg/apache/openejb/jee/oejb2/SqlGeneratorType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/SqlGeneratorType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/SqlGeneratorType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbRelationshipRoleTypeCmrField", "()Lorg/apache/openejb/jee/oejb2/EjbRelationshipRoleType$CmrField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$CmrField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$CmrField", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSessionBeanType", "()Lorg/apache/openejb/jee/oejb2/SessionBeanType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/SessionBeanType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/SessionBeanType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createWebServiceSecurityType", "()Lorg/apache/openejb/jee/oejb2/WebServiceSecurityType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/WebServiceSecurityType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/WebServiceSecurityType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbRefType", "()Lorg/apache/openejb/jee/oejb2/EjbRefType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EjbRefType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EjbRefType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResourceEnvRefType", "()Lorg/apache/openejb/jee/oejb2/ResourceEnvRefType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ResourceEnvRefType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ResourceEnvRefType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbRelationshipRoleType", "()Lorg/apache/openejb/jee/oejb2/EjbRelationshipRoleType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanRefType", "()Lorg/apache/openejb/jee/oejb2/GbeanRefType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/GbeanRefType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/GbeanRefType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityBeanTypePrefetchGroup", "()Lorg/apache/openejb/jee/oejb2/EntityBeanType$PrefetchGroup;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EntityBeanType$PrefetchGroup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EntityBeanType$PrefetchGroup", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanLocatorType", "()Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/GbeanLocatorType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/GbeanLocatorType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResourceRefType", "()Lorg/apache/openejb/jee/oejb2/ResourceRefType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ResourceRefType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ResourceRefType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCustomGeneratorType", "()Lorg/apache/openejb/jee/oejb2/CustomGeneratorType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/CustomGeneratorType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/CustomGeneratorType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMessageDestinationType", "()Lorg/apache/openejb/jee/oejb2/MessageDestinationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/MessageDestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/MessageDestinationType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createApplicationType", "()Lorg/apache/openejb/jee/oejb2/ApplicationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ApplicationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ApplicationType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityGroupMappingType", "()Lorg/apache/openejb/jee/oejb2/EntityGroupMappingType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EntityGroupMappingType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EntityGroupMappingType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createServiceRefType", "()Lorg/apache/openejb/jee/oejb2/ServiceRefType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ServiceRefType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ServiceRefType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createKeyGeneratorType", "()Lorg/apache/openejb/jee/oejb2/KeyGeneratorType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/KeyGeneratorType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/KeyGeneratorType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbLocalRefType", "()Lorg/apache/openejb/jee/oejb2/EjbLocalRefType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EjbLocalRefType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EjbLocalRefType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createServiceModuleType", "()Lorg/apache/openejb/jee/oejb2/ServiceModuleType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ServiceModuleType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ServiceModuleType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createServiceCompletionType", "()Lorg/apache/openejb/jee/oejb2/ServiceCompletionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ServiceCompletionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ServiceCompletionType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createPatternType", "()Lorg/apache/openejb/jee/oejb2/PatternType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/PatternType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/PatternType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDependencyType", "()Lorg/apache/openejb/jee/oejb2/DependencyType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/DependencyType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/DependencyType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createOpenejbJarType", "()Lorg/apache/openejb/jee/oejb2/OpenejbJarType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/OpenejbJarType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/OpenejbJarType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityBeanType", "()Lorg/apache/openejb/jee/oejb2/EntityBeanType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EntityBeanType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EntityBeanType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbRelationshipRoleTypeRelationshipRoleSource", "()Lorg/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RelationshipRoleSource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RelationshipRoleSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RelationshipRoleSource", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createActivationConfigType", "()Lorg/apache/openejb/jee/oejb2/ActivationConfigType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ActivationConfigType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ActivationConfigType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createArtifactType", "()Lorg/apache/openejb/jee/oejb2/ArtifactType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ArtifactType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ArtifactType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createExtModuleType", "()Lorg/apache/openejb/jee/oejb2/ExtModuleType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ExtModuleType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ExtModuleType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanType", "()Lorg/apache/openejb/jee/oejb2/GbeanType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/GbeanType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/GbeanType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEmptyType", "()Lorg/apache/openejb/jee/oejb2/EmptyType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EmptyType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EmptyType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQueryType", "()Lorg/apache/openejb/jee/oejb2/QueryType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/QueryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/QueryType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDatabaseGeneratedType", "()Lorg/apache/openejb/jee/oejb2/DatabaseGeneratedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/DatabaseGeneratedType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/DatabaseGeneratedType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCmrFieldGroupMappingType", "()Lorg/apache/openejb/jee/oejb2/CmrFieldGroupMappingType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/CmrFieldGroupMappingType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/CmrFieldGroupMappingType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbRelationshipRoleTypeRoleMappingCmrFieldMapping", "()Lorg/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping$CmrFieldMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping$CmrFieldMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping$CmrFieldMapping", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createPortType", "()Lorg/apache/openejb/jee/oejb2/PortType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/PortType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/PortType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbRelationshipRoleTypeRoleMapping", "()Lorg/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EjbRelationshipRoleType$RoleMapping", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityBeanTypeCmpFieldMapping", "()Lorg/apache/openejb/jee/oejb2/EntityBeanType$CmpFieldMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/EntityBeanType$CmpFieldMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/EntityBeanType$CmpFieldMapping", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createModuleType", "()Lorg/apache/openejb/jee/oejb2/ModuleType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ModuleType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ModuleType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMessageDrivenBeanType", "()Lorg/apache/openejb/jee/oejb2/MessageDrivenBeanType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/MessageDrivenBeanType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/MessageDrivenBeanType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createPersistenceContextRefType", "()Lorg/apache/openejb/jee/oejb2/PersistenceContextRefType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/PersistenceContextRefType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/PersistenceContextRefType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createPortCompletionType", "()Lorg/apache/openejb/jee/oejb2/PortCompletionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/PortCompletionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/PortCompletionType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResourceLocatorType", "()Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ResourceLocatorType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ResourceLocatorType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDependenciesType", "()Lorg/apache/openejb/jee/oejb2/DependenciesType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/DependenciesType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/DependenciesType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQueryTypeQueryMethodMethodParams", "()Lorg/apache/openejb/jee/oejb2/QueryType$QueryMethod$MethodParams;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/QueryType$QueryMethod$MethodParams");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/QueryType$QueryMethod$MethodParams", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReferenceType", "()Lorg/apache/openejb/jee/oejb2/ReferenceType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/ReferenceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/ReferenceType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createPropertyType", "()Lorg/apache/openejb/jee/oejb2/PropertyType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/PropertyType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/PropertyType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAttributeType", "()Lorg/apache/openejb/jee/oejb2/AttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/AttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/AttributeType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanTypeReferences", "(Lorg/apache/openejb/jee/oejb2/ReferencesType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ReferencesType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ReferencesType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "references");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeReferences_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ReferencesType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanTypeXmlReference", "(Lorg/apache/openejb/jee/oejb2/XmlAttributeType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/XmlAttributeType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/XmlAttributeType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "xml-reference");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeXmlReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/XmlAttributeType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanTypeDependency", "(Lorg/apache/openejb/jee/oejb2/PatternType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/PatternType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/PatternType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "dependency");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeDependency_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/PatternType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanTypeAttribute", "(Lorg/apache/openejb/jee/oejb2/AttributeType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/AttributeType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/AttributeType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "attribute");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeAttribute_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/AttributeType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanTypeReference", "(Lorg/apache/openejb/jee/oejb2/ReferenceType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ReferenceType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ReferenceType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "reference");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ReferenceType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanTypeXmlAttribute", "(Lorg/apache/openejb/jee/oejb2/XmlAttributeType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/XmlAttributeType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/XmlAttributeType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "xml-attribute");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeXmlAttribute_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/XmlAttributeType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResourceEnvRef", "(Lorg/apache/openejb/jee/oejb2/ResourceEnvRefType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ResourceEnvRefType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ResourceEnvRefType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "resource-env-ref");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ResourceEnvRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ResourceEnvRefType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResourceRef", "(Lorg/apache/openejb/jee/oejb2/ResourceRefType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ResourceRefType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ResourceRefType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "resource-ref");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ResourceRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ResourceRefType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityManagerFactoryRef", "(Lorg/apache/openejb/jee/oejb2/PersistenceUnitRefType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/PersistenceUnitRefType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/PersistenceUnitRefType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "entity-manager-factory-ref");
annotationVisitor0.visit("substitutionHeadNamespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("substitutionHeadName", "abstract-naming-entry");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_EntityManagerFactoryRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/PersistenceUnitRefType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAbstractNamingEntry", "(Lorg/apache/openejb/jee/oejb2/AbstractNamingEntryType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/AbstractNamingEntryType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/AbstractNamingEntryType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "abstract-naming-entry");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_AbstractNamingEntry_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/AbstractNamingEntryType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDependencies", "(Lorg/apache/openejb/jee/oejb2/DependenciesType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/DependenciesType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/DependenciesType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "dependencies");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Dependencies_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/DependenciesType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createApplication", "(Lorg/apache/openejb/jee/oejb2/ApplicationType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ApplicationType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ApplicationType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
annotationVisitor0.visit("name", "application");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Application_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ApplicationType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMessageDestination", "(Lorg/apache/openejb/jee/oejb2/MessageDestinationType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/MessageDestinationType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/MessageDestinationType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "message-destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_MessageDestination_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/MessageDestinationType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createModule", "(Lorg/apache/openejb/jee/oejb2/ServiceModuleType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ServiceModuleType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ServiceModuleType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "module");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Module_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ServiceModuleType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createClustering", "(Lorg/apache/openejb/jee/oejb2/AbstractClusteringType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/AbstractClusteringType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/AbstractClusteringType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
annotationVisitor0.visit("name", "clustering");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Clustering_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/AbstractClusteringType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createKeyGenerator", "(Lorg/apache/openejb/jee/oejb2/KeyGeneratorType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/KeyGeneratorType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/KeyGeneratorType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://tomee.apache.org/xml/ns/pkgen-2.1");
annotationVisitor0.visit("name", "key-generator");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_KeyGenerator_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/KeyGeneratorType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEnvironment", "(Lorg/apache/openejb/jee/oejb2/EnvironmentType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/EnvironmentType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/EnvironmentType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "environment");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Environment_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/EnvironmentType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSecurity", "(Lorg/apache/openejb/jee/oejb2/AbstractSecurityType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/AbstractSecurityType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/AbstractSecurityType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
annotationVisitor0.visit("name", "security");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Security_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/AbstractSecurityType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResourceAdapter", "(Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "resource-adapter");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ResourceAdapter_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbLocalRef", "(Lorg/apache/openejb/jee/oejb2/EjbLocalRefType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/EjbLocalRefType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/EjbLocalRefType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "ejb-local-ref");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_EjbLocalRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/EjbLocalRefType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createServerEnvironment", "(Lorg/apache/openejb/jee/oejb2/EnvironmentType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/EnvironmentType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/EnvironmentType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "server-environment");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ServerEnvironment_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/EnvironmentType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createService", "(Lorg/apache/openejb/jee/oejb2/AbstractServiceType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/AbstractServiceType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/AbstractServiceType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "service");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Service_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/AbstractServiceType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbean", "(Lorg/apache/openejb/jee/oejb2/GbeanType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/GbeanType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/GbeanType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "gbean");
annotationVisitor0.visit("substitutionHeadNamespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("substitutionHeadName", "service");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Gbean_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSecurity", "(Lorg/apache/openejb/jee/oejb2/SecurityType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/SecurityType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/SecurityType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/security-2.0");
annotationVisitor0.visit("name", "security");
annotationVisitor0.visit("substitutionHeadNamespace", "http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
annotationVisitor0.visit("substitutionHeadName", "security");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Security2_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/SecurityType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createWorkmanager", "(Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "workmanager");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Workmanager_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createServiceRef", "(Lorg/apache/openejb/jee/oejb2/ServiceRefType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ServiceRefType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ServiceRefType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "service-ref");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ServiceRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ServiceRefType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCmpConnectionFactory", "(Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "cmp-connection-factory");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_CmpConnectionFactory_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/ResourceLocatorType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createClientEnvironment", "(Lorg/apache/openejb/jee/oejb2/EnvironmentType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/EnvironmentType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/EnvironmentType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor0.visit("name", "client-environment");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ClientEnvironment_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/EnvironmentType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGbeanRef", "(Lorg/apache/openejb/jee/oejb2/GbeanRefType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/GbeanRefType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/GbeanRefType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "gbean-ref");
annotationVisitor0.visit("substitutionHeadNamespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("substitutionHeadName", "abstract-naming-entry");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanRefType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createOpenejbJar", "(Lorg/apache/openejb/jee/oejb2/OpenejbJarType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/OpenejbJarType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/OpenejbJarType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://tomee.apache.org/xml/ns/openejb-jar-2.2");
annotationVisitor0.visit("name", "openejb-jar");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_OpenejbJar_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/OpenejbJarType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbRef", "(Lorg/apache/openejb/jee/oejb2/EjbRefType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/EjbRefType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/EjbRefType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "ejb-ref");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_EjbRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/EjbRefType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createWebContainer", "(Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor0.visit("name", "web-container");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_WebContainer_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GbeanLocatorType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEjbJar", "(Lorg/apache/openejb/jee/oejb2/GeronimoEjbJarType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/GeronimoEjbJarType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/GeronimoEjbJarType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0");
annotationVisitor0.visit("name", "ejb-jar");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_EjbJar_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/GeronimoEjbJarType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createOpenejbClusteringWadiType", "()Lorg/apache/openejb/jee/oejb2/OpenejbClusteringWadiType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/oejb2/OpenejbClusteringWadiType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/oejb2/OpenejbClusteringWadiType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createOpenejbClusteringWadi", "(Lorg/apache/openejb/jee/oejb2/OpenejbClusteringWadiType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/openejb/jee/oejb2/OpenejbClusteringWadiType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/openejb/jee/oejb2/OpenejbClusteringWadiType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://geronimo.apache.org/xml/ns/openejb-clustering-wadi-1.2");
annotationVisitor0.visit("name", "openejb-clustering-wadi");
annotationVisitor0.visit("substitutionHeadNamespace", "http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
annotationVisitor0.visit("substitutionHeadName", "clustering");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_OpenejbClusteringWadi_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/oejb2/OpenejbClusteringWadiType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("references");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeReferences_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("xml-reference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeXmlReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("dependency");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeDependency_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeAttribute_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("reference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("xml-attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanTypeXmlAttribute_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("resource-env-ref");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ResourceEnvRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("resource-ref");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ResourceRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("entity-manager-factory-ref");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_EntityManagerFactoryRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("abstract-naming-entry");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_AbstractNamingEntry_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("dependencies");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Dependencies_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
methodVisitor.visitLdcInsn("application");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Application_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("message-destination");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_MessageDestination_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("module");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Module_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
methodVisitor.visitLdcInsn("clustering");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Clustering_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://tomee.apache.org/xml/ns/pkgen-2.1");
methodVisitor.visitLdcInsn("key-generator");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_KeyGenerator_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("environment");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Environment_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
methodVisitor.visitLdcInsn("security");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Security_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/security-2.0");
methodVisitor.visitLdcInsn("security");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Security2_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("resource-adapter");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ResourceAdapter_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("ejb-local-ref");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_EjbLocalRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("server-environment");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ServerEnvironment_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("service");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Service_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("gbean");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Gbean_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("workmanager");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_Workmanager_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("service-ref");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ServiceRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("cmp-connection-factory");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_CmpConnectionFactory_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/deployment-1.2");
methodVisitor.visitLdcInsn("client-environment");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_ClientEnvironment_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("gbean-ref");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_GbeanRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://tomee.apache.org/xml/ns/openejb-jar-2.2");
methodVisitor.visitLdcInsn("openejb-jar");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_OpenejbJar_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("ejb-ref");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_EjbRef_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/naming-1.2");
methodVisitor.visitLdcInsn("web-container");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_WebContainer_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/openejb-clustering-wadi-1.2");
methodVisitor.visitLdcInsn("openejb-clustering-wadi");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_OpenejbClusteringWadi_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://geronimo.apache.org/xml/ns/j2ee/ejb/openejb-2.0");
methodVisitor.visitLdcInsn("ejb-jar");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/oejb2/ObjectFactory", "_EjbJar_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

package asm.org.eclipse.persistence.jaxb;
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
public class JAXBContextPropertiesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jaxb/JAXBContextProperties", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSON_ATTRIBUTE_PREFIX", "Ljava/lang/String;", null, "eclipselink.json.attribute-prefix");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSON_INCLUDE_ROOT", "Ljava/lang/String;", null, "eclipselink.json.include-root");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSON_NAMESPACE_SEPARATOR", "Ljava/lang/String;", null, "eclipselink.json.namespace-separator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSON_VALUE_WRAPPER", "Ljava/lang/String;", null, "eclipselink.json.value-wrapper");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MEDIA_TYPE", "Ljava/lang/String;", null, "eclipselink.media-type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMESPACE_PREFIX_MAPPER", "Ljava/lang/String;", null, "eclipselink.namespace-prefix-mapper");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION_EVENT_LISTENER", "Ljava/lang/String;", null, "eclipselink.session-event-listener");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OXM_METADATA_SOURCE", "Ljava/lang/String;", null, "eclipselink.oxm.metadata-source");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_TARGET_NAMESPACE", "Ljava/lang/String;", null, "eclipselink.default-target-namespace");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANNOTATION_HELPER", "Ljava/lang/String;", null, "eclipselink.annotation-helper");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_ACCESSOR_FACTORY_SUPPORT", "Ljava/lang/String;", null, "eclipselink.xml-accessor-factory.support");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OBJECT_GRAPH", "Ljava/lang/String;", null, "eclipselink.object-graph");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSON_WRAPPER_AS_ARRAY_NAME", "Ljava/lang/String;", null, "eclipselink.json.wrapper-as-array-name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSON_USE_XSD_TYPES_WITH_PREFIX", "Ljava/lang/String;", null, "eclipselink.json.use-xsd-types-with-prefix");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSON_TYPE_COMPATIBILITY", "Ljava/lang/String;", null, "eclipselink.json.type-compatibility");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSON_TYPE_ATTRIBUTE_NAME", "Ljava/lang/String;", null, "eclipselink.json.type-attribute-name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNMARSHALLING_CASE_INSENSITIVE", "Ljava/lang/String;", null, "eclipselink.unmarshalling.case-insensitive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEAN_VALIDATION_MODE", "Ljava/lang/String;", null, "eclipselink.beanvalidation.mode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEAN_VALIDATION_FACTORY", "Ljava/lang/String;", null, "eclipselink.beanvalidation.factory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEAN_VALIDATION_GROUPS", "Ljava/lang/String;", null, "eclipselink.beanvalidation.groups");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEAN_VALIDATION_FACETS", "Ljava/lang/String;", null, "eclipselink.beanvalidation.facets");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEAN_VALIDATION_NO_OPTIMISATION", "Ljava/lang/String;", null, "eclipselink.beanvalidation.no-optimisation");
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

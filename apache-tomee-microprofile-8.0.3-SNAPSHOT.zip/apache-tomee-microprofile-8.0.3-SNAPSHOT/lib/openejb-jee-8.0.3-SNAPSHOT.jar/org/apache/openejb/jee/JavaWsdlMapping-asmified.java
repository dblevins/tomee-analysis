package asm.org.apache.openejb.jee;
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
public class JavaWsdlMappingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/jee/JavaWsdlMapping", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlRootElement;", true);
annotationVisitor0.visit("name", "java-wsdl-mapping");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlAccessorType;", true);
annotationVisitor0.visitEnum("value", "Ljakarta/xml/bind/annotation/XmlAccessType;", "FIELD");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlType;", true);
annotationVisitor0.visit("name", "java-wsdl-mappingType");
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("propOrder");
annotationVisitor1.visit(null, "packageMapping");
annotationVisitor1.visit(null, "javaXmlTypeMapping");
annotationVisitor1.visit(null, "exceptionMapping");
annotationVisitor1.visit(null, "serviceInterfaceMapping");
annotationVisitor1.visit(null, "serviceEndpointInterfaceMapping");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "packageMapping", "Lorg/apache/openejb/jee/KeyedCollection;", "Lorg/apache/openejb/jee/KeyedCollection<Ljava/lang/String;Lorg/apache/openejb/jee/PackageMapping;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "package-mapping");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "javaXmlTypeMapping", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/openejb/jee/JavaXmlTypeMapping;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "java-xml-type-mapping");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "exceptionMapping", "Lorg/apache/openejb/jee/KeyedCollection;", "Lorg/apache/openejb/jee/KeyedCollection<Ljavax/xml/namespace/QName;Lorg/apache/openejb/jee/ExceptionMapping;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "exception-mapping");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "serviceInterfaceMapping", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/openejb/jee/ServiceInterfaceMapping;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "service-interface-mapping");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "serviceEndpointInterfaceMapping", "Lorg/apache/openejb/jee/KeyedCollection;", "Lorg/apache/openejb/jee/KeyedCollection<Ljava/lang/String;Lorg/apache/openejb/jee/ServiceEndpointInterfaceMapping;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "service-endpoint-interface-mapping");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "id", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/adapters/XmlJavaTypeAdapter;", true);
annotationVisitor0.visit("value", Type.getType("Ljakarta/xml/bind/annotation/adapters/CollapsedStringAdapter;"));
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlID;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "version", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlAttribute;", true);
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPackageMapping", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/openejb/jee/PackageMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "packageMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/KeyedCollection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/KeyedCollection", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "packageMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "packageMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPackageMappingMap", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/jee/PackageMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "packageMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/KeyedCollection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/KeyedCollection", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "packageMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "packageMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/KeyedCollection", "toMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJavaXmlTypeMapping", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openejb/jee/JavaXmlTypeMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "javaXmlTypeMapping", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "javaXmlTypeMapping", "Ljava/util/List;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "javaXmlTypeMapping", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionMapping", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/openejb/jee/ExceptionMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "exceptionMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/KeyedCollection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/KeyedCollection", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "exceptionMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "exceptionMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionMappingMap", "()Ljava/util/Map;", "()Ljava/util/Map<Ljavax/xml/namespace/QName;Lorg/apache/openejb/jee/ExceptionMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "exceptionMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/KeyedCollection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/KeyedCollection", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "exceptionMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "exceptionMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/KeyedCollection", "toMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServiceInterfaceMapping", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openejb/jee/ServiceInterfaceMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceInterfaceMapping", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceInterfaceMapping", "Ljava/util/List;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceInterfaceMapping", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServiceEndpointInterfaceMapping", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/openejb/jee/ServiceEndpointInterfaceMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceEndpointInterfaceMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/KeyedCollection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/KeyedCollection", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceEndpointInterfaceMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceEndpointInterfaceMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServiceEndpointInterfaceMappingMap", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/jee/ServiceEndpointInterfaceMapping;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceEndpointInterfaceMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/KeyedCollection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/KeyedCollection", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceEndpointInterfaceMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "serviceEndpointInterfaceMapping", "Lorg/apache/openejb/jee/KeyedCollection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/KeyedCollection", "toMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setId", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersion", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "version", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("1.1");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "version", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVersion", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaWsdlMapping", "version", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

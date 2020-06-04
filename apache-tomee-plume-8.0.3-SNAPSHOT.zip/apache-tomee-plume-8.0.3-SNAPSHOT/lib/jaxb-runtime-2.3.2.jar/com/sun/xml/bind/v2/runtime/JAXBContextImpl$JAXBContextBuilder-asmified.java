package asm.com.sun.xml.bind.v2.runtime;
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
public class JAXBContextImpl$JAXBContextBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "JAXBContextBuilder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/JAXBContextImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "retainPropertyInfo", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "supressAccessorWarnings", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultNsUri", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotationReader", "Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "subclassReplacements", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class;Ljava/lang/Class;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "c14nSupport", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "classes", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "typeRefs", "Ljava/util/Collection;", "Ljava/util/Collection<Lcom/sun/xml/bind/api/TypeReference;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlAccessorFactorySupport", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "allNillable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "improvedXsiTypeHandling", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "disableSecurityProcessing", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "backupWithParentNamespace", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "retainPropertyInfo", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "supressAccessorWarnings", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "defaultNsUri", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/annotation/RuntimeInlineAnnotationReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/annotation/RuntimeInlineAnnotationReader", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "annotationReader", "Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "subclassReplacements", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "c14nSupport", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "xmlAccessorFactorySupport", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "improvedXsiTypeHandling", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "disableSecurityProcessing", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "backupWithParentNamespace", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "retainPropertyInfo", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "supressAccessorWarnings", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "defaultNsUri", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/annotation/RuntimeInlineAnnotationReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/annotation/RuntimeInlineAnnotationReader", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "annotationReader", "Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "subclassReplacements", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "c14nSupport", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "xmlAccessorFactorySupport", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "improvedXsiTypeHandling", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "disableSecurityProcessing", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "backupWithParentNamespace", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "supressAccessorWarnings", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "supressAccessorWarnings", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "retainPropertyInfo", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "retainPropertyInfo", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "access$1300", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "defaultNsUri", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "access$1400", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "annotationReader", "Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "access$1500", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "subclassReplacements", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "c14nSupport", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "c14nSupport", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "access$1600", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)[Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "classes", "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "access$1700", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "keySet", "()Ljava/util/Set;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "typeRefs", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "xmlAccessorFactorySupport", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "xmlAccessorFactorySupport", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "allNillable", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "allNillable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "disableSecurityProcessing", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "disableSecurityProcessing", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "backupWithParentNamespace", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "backupWithParentNamespace", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRetainPropertyInfo", "(Z)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "retainPropertyInfo", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSupressAccessorWarnings", "(Z)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "supressAccessorWarnings", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setC14NSupport", "(Z)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "c14nSupport", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXmlAccessorFactorySupport", "(Z)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "xmlAccessorFactorySupport", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultNsUri", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "defaultNsUri", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAllNillable", "(Z)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "allNillable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClasses", "([Ljava/lang/Class;)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "classes", "[Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAnnotationReader", "(Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "annotationReader", "Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSubclassReplacements", "(Ljava/util/Map;)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", "(Ljava/util/Map<Ljava/lang/Class;Ljava/lang/Class;>;)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "subclassReplacements", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTypeRefs", "(Ljava/util/Collection;)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", "(Ljava/util/Collection<Lcom/sun/xml/bind/api/TypeReference;>;)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "typeRefs", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setImprovedXsiTypeHandling", "(Z)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "improvedXsiTypeHandling", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDisableSecurityProcessing", "(Z)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "disableSecurityProcessing", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBackupWithParentNamespace", "(Ljava/lang/Boolean;)Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "backupWithParentNamespace", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "defaultNsUri", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "defaultNsUri", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "subclassReplacements", "Ljava/util/Map;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "subclassReplacements", "Ljava/util/Map;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "annotationReader", "Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/annotation/RuntimeInlineAnnotationReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/annotation/RuntimeInlineAnnotationReader", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "annotationReader", "Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "typeRefs", "Ljava/util/Collection;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "typeRefs", "Ljava/util/Collection;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/JAXBContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "defaultNsUri", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "retainPropertyInfo", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "annotationReader", "Lcom/sun/xml/bind/v2/model/annotation/RuntimeAnnotationReader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "subclassReplacements", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "c14nSupport", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)[Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "classes", "[Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "xmlAccessorFactorySupport", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "allNillable", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "supressAccessorWarnings", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "improvedXsiTypeHandling", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "disableSecurityProcessing", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1100", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "backupWithParentNamespace", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder;)Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl$JAXBContextBuilder", "typeRefs", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

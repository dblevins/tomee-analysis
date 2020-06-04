package asm.org.apache.ws.commons.schema;
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
public class XmlSchemaComplexTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/ws/commons/schema/XmlSchemaComplexType", null, "org/apache/ws/commons/schema/XmlSchemaType", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "anyAttribute", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeWildcard", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributes", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/ws/commons/schema/XmlSchemaAttributeOrGroupRef;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "block", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "blockResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contentModel", "Lorg/apache/ws/commons/schema/XmlSchemaContentModel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contentType", "Lorg/apache/ws/commons/schema/XmlSchemaContentType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "particleType", "Lorg/apache/ws/commons/schema/XmlSchemaParticle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "particle", "Lorg/apache/ws/commons/schema/XmlSchemaParticle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isAbstract", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isMixed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/ws/commons/schema/XmlSchema;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaType", "<init>", "(Lorg/apache/ws/commons/schema/XmlSchema;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "synchronizedList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "attributes", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/ws/commons/schema/XmlSchemaDerivationMethod", "NONE", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "block", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "isAbstract", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "isMixed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnyAttribute", "()Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "anyAttribute", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAnyAttribute", "(Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "anyAttribute", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributes", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/ws/commons/schema/XmlSchemaAttributeOrGroupRef;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "attributes", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeWildcard", "()Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "attributeWildcard", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBlock", "()Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "block", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBlock", "(Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "block", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBlockResolved", "()Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "blockResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentModel", "()Lorg/apache/ws/commons/schema/XmlSchemaContentModel;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "contentModel", "Lorg/apache/ws/commons/schema/XmlSchemaContentModel;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContentModel", "(Lorg/apache/ws/commons/schema/XmlSchemaContentModel;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "contentModel", "Lorg/apache/ws/commons/schema/XmlSchemaContentModel;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentType", "()Lorg/apache/ws/commons/schema/XmlSchemaContentType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "contentType", "Lorg/apache/ws/commons/schema/XmlSchemaContentType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContentType", "(Lorg/apache/ws/commons/schema/XmlSchemaContentType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "contentType", "Lorg/apache/ws/commons/schema/XmlSchemaContentType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentTypeParticle", "()Lorg/apache/ws/commons/schema/XmlSchemaParticle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "particleType", "Lorg/apache/ws/commons/schema/XmlSchemaParticle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAbstract", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "isAbstract", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAbstract", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "isAbstract", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMixed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "isMixed", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMixed", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "isMixed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParticle", "()Lorg/apache/ws/commons/schema/XmlSchemaParticle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "particle", "Lorg/apache/ws/commons/schema/XmlSchemaParticle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParticle", "(Lorg/apache/ws/commons/schema/XmlSchemaParticle;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "particle", "Lorg/apache/ws/commons/schema/XmlSchemaParticle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseSchemaTypeName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaComplexType", "getContentModel", "()Lorg/apache/ws/commons/schema/XmlSchemaContentModel;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/ws/commons/schema/XmlSchemaContentModel"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaContentModel", "getContent", "()Lorg/apache/ws/commons/schema/XmlSchemaContent;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/ws/commons/schema/XmlSchemaContent"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/ws/commons/schema/XmlSchemaComplexContentExtension");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/ws/commons/schema/XmlSchemaComplexContentExtension");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaComplexContentExtension", "getBaseTypeName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/ws/commons/schema/XmlSchemaComplexContentRestriction");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/ws/commons/schema/XmlSchemaComplexContentRestriction");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaComplexContentRestriction", "getBaseTypeName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setAttributeWildcard", "(Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "attributeWildcard", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setAttributes", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/apache/ws/commons/schema/XmlSchemaAttributeOrGroupRef;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "attributes", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setBlockResolved", "(Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "blockResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setParticleType", "(Lorg/apache/ws/commons/schema/XmlSchemaParticle;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "particleType", "Lorg/apache/ws/commons/schema/XmlSchemaParticle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getParticleType", "()Lorg/apache/ws/commons/schema/XmlSchemaParticle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaComplexType", "particleType", "Lorg/apache/ws/commons/schema/XmlSchemaParticle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

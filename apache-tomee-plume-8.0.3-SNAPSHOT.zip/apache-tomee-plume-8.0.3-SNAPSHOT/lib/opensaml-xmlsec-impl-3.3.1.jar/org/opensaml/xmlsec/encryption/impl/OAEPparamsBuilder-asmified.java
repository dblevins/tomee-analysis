package asm.org.opensaml.xmlsec.encryption.impl;
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
public class OAEPparamsBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/encryption/impl/OAEPparamsBuilder", "Lorg/opensaml/core/xml/AbstractXMLObjectBuilder<Lorg/opensaml/xmlsec/encryption/OAEPparams;>;Lorg/opensaml/xmlsec/encryption/XMLEncryptionBuilder<Lorg/opensaml/xmlsec/encryption/OAEPparams;>;", "org/opensaml/core/xml/AbstractXMLObjectBuilder", new String[] { "org/opensaml/xmlsec/encryption/XMLEncryptionBuilder" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/AbstractXMLObjectBuilder", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildObject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/opensaml/xmlsec/encryption/OAEPparams;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/impl/OAEPparamsImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/impl/OAEPparamsImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildObject", "()Lorg/opensaml/xmlsec/encryption/OAEPparams;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("OAEPparams");
methodVisitor.visitLdcInsn("xenc");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/impl/OAEPparamsBuilder", "buildObject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/opensaml/xmlsec/encryption/OAEPparams;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "buildObject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/opensaml/core/xml/XMLObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/impl/OAEPparamsBuilder", "buildObject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/opensaml/xmlsec/encryption/OAEPparams;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "buildObject", "()Lorg/opensaml/core/xml/XMLObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/impl/OAEPparamsBuilder", "buildObject", "()Lorg/opensaml/xmlsec/encryption/OAEPparams;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

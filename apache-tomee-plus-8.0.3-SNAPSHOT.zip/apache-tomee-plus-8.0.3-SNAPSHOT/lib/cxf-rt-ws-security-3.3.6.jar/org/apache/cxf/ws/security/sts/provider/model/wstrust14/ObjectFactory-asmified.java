package asm.org.apache.cxf.ws.security.sts.provider.model.wstrust14;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlRegistry;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_InteractiveChallenge_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Title_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_TextChallenge_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ChoiceChallenge_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ContextData_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_InteractiveChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_TextChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ChoiceChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ActAs_QNAME", "Ljavax/xml/namespace/QName;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInteractiveChallengeType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTitleType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TitleType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/TitleType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/TitleType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTextChallengeType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createChoiceChallengeType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContextDataType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ContextDataType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ContextDataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ContextDataType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInteractiveChallengeResponseType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeResponseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeResponseType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeResponseType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTextChallengeResponseType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeResponseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeResponseType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeResponseType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createChoiceChallengeResponseType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeResponseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeResponseType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeResponseType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createActAsType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ActAsType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ActAsType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ActAsType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createImageType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ImageType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ImageType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ImageType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createChoiceType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createChoiceSelectedType", "()Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceSelectedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceSelectedType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceSelectedType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInteractiveChallenge", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "InteractiveChallenge");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_InteractiveChallenge_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTitle", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TitleType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TitleType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TitleType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "Title");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_Title_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TitleType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTextChallenge", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "TextChallenge");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_TextChallenge_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createChoiceChallenge", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "ChoiceChallenge");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_ChoiceChallenge_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContextData", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ContextDataType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ContextDataType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ContextDataType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "ContextData");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_ContextData_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ContextDataType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInteractiveChallengeResponse", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeResponseType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeResponseType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeResponseType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "InteractiveChallengeResponse");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_InteractiveChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/InteractiveChallengeResponseType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTextChallengeResponse", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeResponseType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeResponseType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeResponseType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "TextChallengeResponse");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_TextChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/TextChallengeResponseType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createChoiceChallengeResponse", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeResponseType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeResponseType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeResponseType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "ChoiceChallengeResponse");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_ChoiceChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ChoiceChallengeResponseType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createActAs", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ActAsType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ActAsType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ActAsType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visit("name", "ActAs");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_ActAs_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ActAsType;"));
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
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("InteractiveChallenge");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_InteractiveChallenge_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("Title");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_Title_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("TextChallenge");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_TextChallenge_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("ChoiceChallenge");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_ChoiceChallenge_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("ContextData");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_ContextData_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("InteractiveChallengeResponse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_InteractiveChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("TextChallengeResponse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_TextChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("ChoiceChallengeResponse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_ChoiceChallengeResponse_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200802");
methodVisitor.visitLdcInsn("ActAs");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory", "_ActAs_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

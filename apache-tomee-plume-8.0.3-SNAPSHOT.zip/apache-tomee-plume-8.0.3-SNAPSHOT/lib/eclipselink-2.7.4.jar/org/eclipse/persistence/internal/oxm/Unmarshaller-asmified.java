package asm.org.eclipse.persistence.internal.oxm;
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
public class UnmarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/internal/oxm/Unmarshaller", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;CONTEXT:Lorg/eclipse/persistence/internal/oxm/Context;DESCRIPTOR::Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;ID_RESOLVER:Lorg/eclipse/persistence/internal/oxm/IDResolver;MEDIA_TYPE::Lorg/eclipse/persistence/internal/oxm/MediaType;ROOT:Lorg/eclipse/persistence/internal/oxm/Root;UNMARSHALLER_HANDLER::Lorg/eclipse/persistence/internal/oxm/UnmarshallerHandler;UNMARSHALLER_LISTENER::Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/oxm/Unmarshaller$Listener", "org/eclipse/persistence/internal/oxm/Unmarshaller", "Listener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "context", "Lorg/eclipse/persistence/internal/oxm/Context;", "TCONTEXT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "unmarshalListener", "Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;", "TUNMARSHALLER_LISTENER;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/oxm/Context;)V", "(TCONTEXT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/Unmarshaller", "context", "Lorg/eclipse/persistence/internal/oxm/Context;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/internal/oxm/Unmarshaller;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/Unmarshaller", "getContext", "()Lorg/eclipse/persistence/internal/oxm/Context;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/Unmarshaller", "context", "Lorg/eclipse/persistence/internal/oxm/Context;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/Unmarshaller", "getUnmarshalListener", "()Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/Unmarshaller", "unmarshalListener", "Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createRoot", "()Lorg/eclipse/persistence/internal/oxm/Root;", "()TROOT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createRootUnmarshalRecord", "(Ljava/lang/Class;)Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createUnmarshalRecord", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", "(TDESCRIPTOR;TABSTRACT_SESSION;)Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttachmentUnmarshaller", "()Lorg/eclipse/persistence/oxm/attachment/XMLAttachmentUnmarshaller;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributePrefix", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContext", "()Lorg/eclipse/persistence/internal/oxm/Context;", "()TCONTEXT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/Unmarshaller", "context", "Lorg/eclipse/persistence/internal/oxm/Context;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getErrorHandler", "()Lorg/xml/sax/ErrorHandler;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIDResolver", "()Lorg/eclipse/persistence/internal/oxm/IDResolver;", "()TID_RESOLVER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMediaType", "()Lorg/eclipse/persistence/internal/oxm/MediaType;", "()TMEDIA_TYPE;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNamespaceSeparator", "()C", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProperty", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchema", "()Ljavax/xml/validation/Schema;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStringBuffer", "()Lorg/eclipse/persistence/internal/oxm/StrBuffer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUnmappedContentHandlerClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUnmarshalAttributeGroup", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUnmarshallerHandler", "()Lorg/eclipse/persistence/internal/oxm/UnmarshallerHandler;", "()TUNMARSHALLER_HANDLER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnmarshalListener", "()Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;", "()TUNMARSHALLER_LISTENER;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/Unmarshaller", "unmarshalListener", "Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getValueWrapper", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isApplicationJSON", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isApplicationXML", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAutoDetectMediaType", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isCaseInsensitive", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isIncludeRoot", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isResultAlwaysXMLRoot", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isWrapperAsCollectionName", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setIDResolver", "(Lorg/eclipse/persistence/internal/oxm/IDResolver;)V", "(TID_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "shouldWarnOnUnmappedElement", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUnmarshalListener", "(Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;)V", "(TUNMARSHALLER_LISTENER;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/Unmarshaller", "unmarshalListener", "Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJsonTypeConfiguration", "()Lorg/eclipse/persistence/internal/oxm/JsonTypeConfiguration;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

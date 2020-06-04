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
public class XMLUnmarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;CONTEXT:Lorg/eclipse/persistence/internal/oxm/Context;DESCRIPTOR::Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;ID_RESOLVER:Lorg/eclipse/persistence/internal/oxm/IDResolver;MEDIA_TYPE::Lorg/eclipse/persistence/internal/oxm/MediaType;ROOT:Lorg/eclipse/persistence/internal/oxm/Root;UNMARSHALLER_HANDLER::Lorg/eclipse/persistence/internal/oxm/UnmarshallerHandler;UNMARSHALLER_LISTENER::Lorg/eclipse/persistence/internal/oxm/Unmarshaller$Listener;>Lorg/eclipse/persistence/internal/oxm/Unmarshaller<TABSTRACT_SESSION;TCONTEXT;TDESCRIPTOR;TID_RESOLVER;TMEDIA_TYPE;TROOT;TUNMARSHALLER_HANDLER;TUNMARSHALLER_LISTENER;>;Ljava/lang/Cloneable;", "org/eclipse/persistence/internal/oxm/Unmarshaller", new String[] { "java/lang/Cloneable" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/oxm/Unmarshaller$Listener", "org/eclipse/persistence/internal/oxm/Unmarshaller", "Listener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/oxm/XMLUnmarshaller$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONVALIDATING", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_VALIDATION", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DTD_VALIDATION", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "STAX_SOURCE_CLASS_NAME", "Ljava/lang/String;", null, "javax.xml.transform.stax.StAXSource");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "XML_STREAM_READER_CLASS_NAME", "Ljava/lang/String;", null, "javax.xml.stream.XMLStreamReader");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "XML_EVENT_READER_CLASS_NAME", "Ljava/lang/String;", null, "javax.xml.stream.XMLEventReader");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "GET_XML_STREAM_READER_METHOD_NAME", "Ljava/lang/String;", null, "getXMLStreamReader");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "GET_XML_EVENT_READER_METHOD_NAME", "Ljava/lang/String;", null, "getXMLEventReader");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "XML_STREAM_READER_READER_CLASS_NAME", "Ljava/lang/String;", null, "org.eclipse.persistence.internal.oxm.record.XMLStreamReaderReader");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "XML_EVENT_READER_READER_CLASS_NAME", "Ljava/lang/String;", null, "org.eclipse.persistence.internal.oxm.record.XMLEventReaderReader");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "XML_STREAM_READER_INPUT_SOURCE_CLASS_NAME", "Ljava/lang/String;", null, "org.eclipse.persistence.internal.oxm.record.XMLStreamReaderInputSource");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "XML_EVENT_READER_INPUT_SOURCE_CLASS_NAME", "Ljava/lang/String;", null, "org.eclipse.persistence.internal.oxm.record.XMLEventReaderInputSource");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "staxSourceClass", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "staxSourceGetStreamReaderMethod", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "staxSourceGetEventReaderMethod", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "xmlStreamReaderReaderConstructor", "Ljava/lang/reflect/Constructor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "xmlStreamReaderInputSourceConstructor", "Ljava/lang/reflect/Constructor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "xmlEventReaderReaderConstructor", "Ljava/lang/reflect/Constructor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "xmlEventReaderInputSourceConstructor", "Ljava/lang/reflect/Constructor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jsonTypeConfiguration", "Lorg/eclipse/persistence/internal/oxm/JsonTypeConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_ERROR_HANDLER", "Lorg/xml/sax/ErrorHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "xmlUnmarshallerHandler", "Lorg/eclipse/persistence/internal/oxm/UnmarshallerHandler;", "TUNMARSHALLER_HANDLER;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "schemasAreInitialized", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attachmentUnmarshaller", "Lorg/eclipse/persistence/oxm/attachment/XMLAttachmentUnmarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "unmarshalProperties", "Ljava/util/Properties;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "unmappedContentHandlerClass", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "stringBuffer", "Lorg/eclipse/persistence/internal/oxm/StrBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mediaType", "Lorg/eclipse/persistence/internal/oxm/MediaType;", "TMEDIA_TYPE;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "idResolver", "Lorg/eclipse/persistence/internal/oxm/IDResolver;", "TID_RESOLVER;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "valueWrapper", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "namespaceSeparator", "C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributePrefix", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "includeRoot", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "namespaceResolver", "Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "autoDetectMediaType", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "caseInsensitive", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "unmarshalAttributeGroup", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wrapperAsCollectionName", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "warnOnUnmappedElement", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "useXsdTypesWithPrefix", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jsonTypeCompatibility", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "DEFAULT_ERROR_HANDLER", "Lorg/xml/sax/ErrorHandler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("javax.xml.transform.stax.StAXSource");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceClass", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceClass", "Ljava/lang/Class;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceClass", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn("getXMLStreamReader");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getDeclaredMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceGetStreamReaderMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceClass", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn("getXMLEventReader");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getDeclaredMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceGetEventReaderMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitLdcInsn("org.eclipse.persistence.internal.oxm.record.XMLStreamReaderInputSource");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLdcInsn("org.eclipse.persistence.internal.oxm.record.XMLEventReaderInputSource");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLdcInsn("javax.xml.stream.XMLStreamReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getConstructorFor", "(Ljava/lang/Class;[Ljava/lang/Class;Z)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlStreamReaderInputSourceConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitLdcInsn("javax.xml.stream.XMLEventReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getConstructorFor", "(Ljava/lang/Class;[Ljava/lang/Class;Z)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlEventReaderInputSourceConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitLdcInsn("org.eclipse.persistence.internal.oxm.record.XMLStreamReaderReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getConstructorFor", "(Ljava/lang/Class;[Ljava/lang/Class;Z)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlStreamReaderReaderConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitLdcInsn("org.eclipse.persistence.internal.oxm.record.XMLEventReaderReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getConstructorFor", "(Ljava/lang/Class;[Ljava/lang/Class;Z)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlEventReaderReaderConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/internal/oxm/Context;)V", "(TCONTEXT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "<init>", "(Lorg/eclipse/persistence/internal/oxm/Context;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/internal/oxm/Context;Ljava/util/Map;)V", "(TCONTEXT;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Boolean;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/Unmarshaller", "<init>", "(Lorg/eclipse/persistence/internal/oxm/Context;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "valueWrapper", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "namespaceSeparator", "C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "includeRoot", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "autoDetectMediaType", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "caseInsensitive", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "wrapperAsCollectionName", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "warnOnUnmappedElement", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "useXsdTypesWithPrefix", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "jsonTypeCompatibility", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/StrBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/StrBuffer", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "stringBuffer", "Lorg/eclipse/persistence/internal/oxm/StrBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "initialize", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "DEFAULT_ERROR_HANDLER", "Lorg/xml/sax/ErrorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "setErrorHandler", "(Lorg/xml/sax/ErrorHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/UnsupportedOperationException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/Unmarshaller", "<init>", "(Lorg/eclipse/persistence/internal/oxm/Unmarshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "valueWrapper", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "namespaceSeparator", "C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "includeRoot", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "autoDetectMediaType", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "caseInsensitive", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "wrapperAsCollectionName", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "warnOnUnmappedElement", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "useXsdTypesWithPrefix", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "jsonTypeCompatibility", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/StrBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/StrBuffer", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "stringBuffer", "Lorg/eclipse/persistence/internal/oxm/StrBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "initialize", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "getAttachmentUnmarshaller", "()Lorg/eclipse/persistence/oxm/attachment/XMLAttachmentUnmarshaller;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "setAttachmentUnmarshaller", "(Lorg/eclipse/persistence/oxm/attachment/XMLAttachmentUnmarshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "getEntityResolver", "()Lorg/xml/sax/EntityResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "getErrorHandler", "()Lorg/xml/sax/ErrorHandler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "setErrorHandler", "(Lorg/xml/sax/ErrorHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "getProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "entrySet", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "getProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "isResultAlwaysXMLRoot", "()Z", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "setResultAlwaysXMLRoot", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "getSchema", "()Ljavax/xml/validation/Schema;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "setSchema", "(Ljavax/xml/validation/Schema;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "org/eclipse/persistence/internal/oxm/XMLUnmarshaller"}, 1, new Object[] {"java/lang/UnsupportedOperationException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmappedContentHandlerClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "setUnmappedContentHandlerClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialize", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Boolean;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "context", "Lorg/eclipse/persistence/internal/oxm/Context;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/Context", "getSession", "()Lorg/eclipse/persistence/core/sessions/CoreSession;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/core/sessions/CoreSession", "getDatasourceLogin", "()Lorg/eclipse/persistence/core/sessions/CoreLogin;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/core/sessions/CoreLogin", "getDatasourcePlatform", "()Lorg/eclipse/persistence/internal/core/databaseaccess/CorePlatform;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/record/XMLPlatform");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/XMLPlatform", "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;Ljava/util/Map;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "setWhitespacePreserving", "(Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMediaType", "(Lorg/eclipse/persistence/internal/oxm/MediaType;)V", "(TMEDIA_TYPE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "mediaType", "Lorg/eclipse/persistence/internal/oxm/MediaType;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "mediaType", "Lorg/eclipse/persistence/internal/oxm/MediaType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "mediaTypeChanged", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMediaType", "()Lorg/eclipse/persistence/internal/oxm/MediaType;", "()TMEDIA_TYPE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "mediaType", "Lorg/eclipse/persistence/internal/oxm/MediaType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXMLContext", "()Lorg/eclipse/persistence/internal/oxm/Context;", "()TCONTEXT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "getContext", "()Lorg/eclipse/persistence/internal/oxm/Context;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXMLContext", "(Lorg/eclipse/persistence/internal/oxm/Context;)V", "(TCONTEXT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "context", "Lorg/eclipse/persistence/internal/oxm/Context;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationMode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "getValidationMode", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityResolver", "()Lorg/xml/sax/EntityResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "getEntityResolver", "()Lorg/xml/sax/EntityResolver;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getErrorHandler", "()Lorg/xml/sax/ErrorHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "getErrorHandler", "()Lorg/xml/sax/ErrorHandler;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setErrorHandler", "(Lorg/xml/sax/ErrorHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "DEFAULT_ERROR_HANDLER", "Lorg/xml/sax/ErrorHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "setErrorHandler", "(Lorg/xml/sax/ErrorHandler;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "setErrorHandler", "(Lorg/xml/sax/ErrorHandler;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnmappedContentHandlerClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmappedContentHandlerClass", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUnmappedContentHandlerClass", "(Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmappedContentHandlerClass", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStringBuffer", "()Lorg/eclipse/persistence/internal/oxm/StrBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "stringBuffer", "Lorg/eclipse/persistence/internal/oxm/StrBuffer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljava/io/File;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljava/io/File;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljava/io/File;Ljava/lang/Class;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljava/io/File;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljava/io/InputStream;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljava/io/InputStream;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljava/io/Reader;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljava/io/Reader;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljava/net/URL;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljava/net/URL;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljava/net/URL;Ljava/lang/Class;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljava/net/URL;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Lorg/xml/sax/InputSource;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/xml/sax/InputSource;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Lorg/xml/sax/InputSource;Ljava/lang/Class;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/xml/sax/InputSource;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Lorg/w3c/dom/Node;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitIntInsn(BIPUSH, 9);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitIntInsn(BIPUSH, 11);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/w3c/dom/Node;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "unmarshalException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Lorg/w3c/dom/Node;Ljava/lang/Class;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/w3c/dom/Node;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljavax/xml/transform/Source;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceClass", "Ljava/lang/Class;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceGetStreamReaderMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeMethod", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlStreamReaderInputSourceConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/xml/sax/InputSource");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlStreamReaderReaderConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/xml/sax/XMLReader");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/xml/sax/XMLReader;Lorg/xml/sax/InputSource;)Ljava/lang/Object;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceGetEventReaderMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeMethod", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlEventReaderInputSourceConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/xml/sax/InputSource");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlEventReaderReaderConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/xml/sax/XMLReader");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/xml/sax/XMLReader;Lorg/xml/sax/InputSource;)Ljava/lang/Object;", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "javax/xml/transform/Source"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "unmarshalException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljavax/xml/transform/Source;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperties", "()Ljava/util/Properties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmarshalProperties", "Ljava/util/Properties;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/Properties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Properties", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmarshalProperties", "Ljava/util/Properties;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmarshalProperties", "Ljava/util/Properties;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperty", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmarshalProperties", "Ljava/util/Properties;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmarshalProperties", "Ljava/util/Properties;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Ljavax/xml/transform/Source;Ljava/lang/Class;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/XMLMarshalException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "nullArgumentException", "()Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceClass", "Ljava/lang/Class;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label7);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceGetStreamReaderMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeMethod", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlStreamReaderInputSourceConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/xml/sax/InputSource");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlStreamReaderReaderConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/xml/sax/XMLReader");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/xml/sax/XMLReader;Lorg/xml/sax/InputSource;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "staxSourceGetEventReaderMethod", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeMethod", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlEventReaderInputSourceConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/xml/sax/InputSource");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "xmlEventReaderReaderConstructor", "Ljava/lang/reflect/Constructor;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "invokeConstructor", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/xml/sax/XMLReader");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/xml/sax/XMLReader;Lorg/xml/sax/InputSource;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "javax/xml/transform/Source", "java/lang/Class"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "unmarshalException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Ljavax/xml/transform/Source;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Lorg/xml/sax/XMLReader;Lorg/xml/sax/InputSource;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/xml/sax/XMLReader;Lorg/xml/sax/InputSource;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshal", "(Lorg/xml/sax/XMLReader;Lorg/xml/sax/InputSource;Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "unmarshal", "(Lorg/xml/sax/XMLReader;Lorg/xml/sax/InputSource;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnmarshallerHandler", "()Lorg/eclipse/persistence/internal/oxm/UnmarshallerHandler;", "()TUNMARSHALLER_HANDLER;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttachmentUnmarshaller", "()Lorg/eclipse/persistence/oxm/attachment/XMLAttachmentUnmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "attachmentUnmarshaller", "Lorg/eclipse/persistence/oxm/attachment/XMLAttachmentUnmarshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttachmentUnmarshaller", "(Lorg/eclipse/persistence/oxm/attachment/XMLAttachmentUnmarshaller;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "attachmentUnmarshaller", "Lorg/eclipse/persistence/oxm/attachment/XMLAttachmentUnmarshaller;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResultAlwaysXMLRoot", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "setResultAlwaysXMLRoot", "(Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isResultAlwaysXMLRoot", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "isResultAlwaysXMLRoot", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSchema", "(Ljavax/xml/validation/Schema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "setSchema", "(Ljavax/xml/validation/Schema;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSchema", "()Ljavax/xml/validation/Schema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "getSchema", "()Ljavax/xml/validation/Schema;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributePrefix", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "attributePrefix", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributePrefix", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "attributePrefix", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueWrapper", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "valueWrapper", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValueWrapper", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "valueWrapper", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceSeparator", "()C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "namespaceSeparator", "C");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNamespaceSeparator", "(C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "namespaceSeparator", "C");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIncludeRoot", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "includeRoot", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIncludeRoot", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "includeRoot", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isApplicationJSON", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "mediaType", "Lorg/eclipse/persistence/internal/oxm/MediaType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "mediaType", "Lorg/eclipse/persistence/internal/oxm/MediaType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/MediaType", "isApplicationJSON", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isApplicationXML", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "mediaType", "Lorg/eclipse/persistence/internal/oxm/MediaType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "mediaType", "Lorg/eclipse/persistence/internal/oxm/MediaType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/MediaType", "isApplicationXML", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAutoDetectMediaType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "autoDetectMediaType", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoDetectMediaType", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "autoDetectMediaType", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCaseInsensitive", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "caseInsensitive", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCaseInsensitive", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "caseInsensitive", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "namespaceResolver", "Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNamespaceResolver", "(Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "namespaceResolver", "Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWrapperAsCollectionName", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "wrapperAsCollectionName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWrapperAsCollectionName", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "wrapperAsCollectionName", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clone", "()Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "<init>", "(Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIDResolver", "()Lorg/eclipse/persistence/internal/oxm/IDResolver;", "()TID_RESOLVER;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "idResolver", "Lorg/eclipse/persistence/internal/oxm/IDResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIDResolver", "(Lorg/eclipse/persistence/internal/oxm/IDResolver;)V", "(TID_RESOLVER;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "idResolver", "Lorg/eclipse/persistence/internal/oxm/IDResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRoot", "()Lorg/eclipse/persistence/internal/oxm/Root;", "()TROOT;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRootUnmarshalRecord", "(Ljava/lang/Class;)Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/record/XMLRootRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/record/XMLRootRecord", "<init>", "(Ljava/lang/Class;Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createUnmarshalRecord", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", "(TDESCRIPTOR;TABSTRACT_SESSION;)Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Descriptor", "getObjectBuilder", "()Lorg/eclipse/persistence/internal/core/descriptors/CoreObjectBuilder;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/core/descriptors/CoreObjectBuilder", "createRecord", "(Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractRecord;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnmarshalAttributeGroup", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmarshalAttributeGroup", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUnmarshalAttributeGroup", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "unmarshalAttributeGroup", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shouldWarnOnUnmappedElement", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "warnOnUnmappedElement", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWarnOnUnmappedElement", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "warnOnUnmappedElement", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJsonTypeConfiguration", "()Lorg/eclipse/persistence/internal/oxm/JsonTypeConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "jsonTypeConfiguration", "Lorg/eclipse/persistence/internal/oxm/JsonTypeConfiguration;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/JsonTypeConfiguration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/JsonTypeConfiguration", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "jsonTypeConfiguration", "Lorg/eclipse/persistence/internal/oxm/JsonTypeConfiguration;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "jsonTypeConfiguration", "Lorg/eclipse/persistence/internal/oxm/JsonTypeConfiguration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "isSecureProcessingDisabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "isSecureProcessingDisabled", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setDisableSecureProcessing", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "platformUnmarshaller", "Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller", "setDisableSecureProcessing", "(Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clone", "()Ljava/lang/Object;", null, new String[] { "java/lang/CloneNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLUnmarshaller", "clone", "()Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

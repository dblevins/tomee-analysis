package asm.org.eclipse.persistence.platform.xml;
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
public class XMLPlatformExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/platform/xml/XMLPlatformException", null, "org/eclipse/persistence/exceptions/EclipseLinkException", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_CLASS_NOT_FOUND", "I", null, new Integer(27001));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_COULD_NOT_INSTANTIATE", "I", null, new Integer(27002));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_COULD_NOT_CREATE_DOCUMENT", "I", null, new Integer(27003));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_INVALID_XPATH", "I", null, new Integer(27004));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_VALIDATION_EXCEPTION", "I", null, new Integer(27005));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_PARSER_ERROR_RESOLVING_XML_SCHEMA", "I", null, new Integer(27006));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_PARSE_EXCEPTION", "I", null, new Integer(27101));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_PARSER_FILE_NOT_FOUND_EXCEPTION", "I", null, new Integer(27102));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_PARSER_SAX_PARSE_EXCEPTION", "I", null, new Integer(27103));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_TRANSFORM_EXCEPTION", "I", null, new Integer(27201));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_PLATFORM_INVALID_TYPE", "I", null, new Integer(27202));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/EclipseLinkException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformClassNotFound", "(Ljava/lang/String;Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitIntInsn(SIPUSH, 27001);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformCouldNotInstantiate", "(Ljava/lang/String;Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitIntInsn(SIPUSH, 27002);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformCouldNotCreateDocument", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 27003);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformInvalidXPath", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 27004);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformValidationException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 27005);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformValidationException", "(Ljava/lang/String;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 27005);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformInvalidTypeException", "(I)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 27202);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformParseException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 27101);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformFileNotFoundException", "(Ljava/io/File;Ljava/io/IOException;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "getAbsolutePath", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitIntInsn(SIPUSH, 27102);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformSAXParseException", "(Lorg/xml/sax/SAXParseException;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getLineNumber", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getSystemId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 27103);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformErrorResolvingXMLSchema", "(Ljava/net/URL;Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitIntInsn(SIPUSH, 27006);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformErrorResolvingXMLSchemas", "([Ljava/lang/Object;Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitIntInsn(SIPUSH, 27006);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "xmlPlatformTransformException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitIntInsn(SIPUSH, 27201);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/XMLPlatformException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/platform/xml/XMLPlatformException;"));
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/XMLPlatformException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

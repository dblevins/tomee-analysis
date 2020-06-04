package asm.org.codehaus.stax2.util;
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
public class StreamReader2DelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/codehaus/stax2/util/StreamReader2Delegate", null, "javax/xml/stream/util/StreamReaderDelegate", new String[] { "org/codehaus/stax2/XMLStreamReader2" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/codehaus/stax2/XMLStreamReader2;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/util/StreamReaderDelegate", "<init>", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParent", "(Ljavax/xml/stream/XMLStreamReader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/util/StreamReaderDelegate", "setParent", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/codehaus/stax2/XMLStreamReader2");
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "closeCompletely", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "closeCompletely", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeInfo", "()Lorg/codehaus/stax2/AttributeInfo;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeInfo", "()Lorg/codehaus/stax2/AttributeInfo;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDTDInfo", "()Lorg/codehaus/stax2/DTDInfo;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getDTDInfo", "()Lorg/codehaus/stax2/DTDInfo;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDepth", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getDepth", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFeature", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getFeature", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocationInfo", "()Lorg/codehaus/stax2/LocationInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getLocationInfo", "()Lorg/codehaus/stax2/LocationInfo;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNonTransientNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getNonTransientNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefixedName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getPrefixedName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getText", "(Ljava/io/Writer;Z)I", null, new String[] { "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getText", "(Ljava/io/Writer;Z)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmptyElement", "()Z", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "isEmptyElement", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPropertySupported", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "isPropertySupported", "(Ljava/lang/String;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFeature", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "setFeature", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skipElement", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "skipElement", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationProblemHandler", "(Lorg/codehaus/stax2/validation/ValidationProblemHandler;)Lorg/codehaus/stax2/validation/ValidationProblemHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "setValidationProblemHandler", "(Lorg/codehaus/stax2/validation/ValidationProblemHandler;)Lorg/codehaus/stax2/validation/ValidationProblemHandler;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stopValidatingAgainst", "(Lorg/codehaus/stax2/validation/XMLValidationSchema;)Lorg/codehaus/stax2/validation/XMLValidator;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "stopValidatingAgainst", "(Lorg/codehaus/stax2/validation/XMLValidationSchema;)Lorg/codehaus/stax2/validation/XMLValidator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stopValidatingAgainst", "(Lorg/codehaus/stax2/validation/XMLValidator;)Lorg/codehaus/stax2/validation/XMLValidator;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "stopValidatingAgainst", "(Lorg/codehaus/stax2/validation/XMLValidator;)Lorg/codehaus/stax2/validation/XMLValidator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateAgainst", "(Lorg/codehaus/stax2/validation/XMLValidationSchema;)Lorg/codehaus/stax2/validation/XMLValidator;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "validateAgainst", "(Lorg/codehaus/stax2/validation/XMLValidationSchema;)Lorg/codehaus/stax2/validation/XMLValidator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeIndex", "(Ljava/lang/String;Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeIndex", "(Ljava/lang/String;Ljava/lang/String;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsBoolean", "(I)Z", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsBoolean", "(I)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsDecimal", "(I)Ljava/math/BigDecimal;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsDecimal", "(I)Ljava/math/BigDecimal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsDouble", "(I)D", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsDouble", "(I)D", true);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsFloat", "(I)F", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsFloat", "(I)F", true);
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsInt", "(I)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsInt", "(I)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsInteger", "(I)Ljava/math/BigInteger;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsInteger", "(I)Ljava/math/BigInteger;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsLong", "(I)J", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsLong", "(I)J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsQName", "(I)Ljavax/xml/namespace/QName;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsQName", "(I)Ljavax/xml/namespace/QName;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsIntArray", "(I)[I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsIntArray", "(I)[I", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsLongArray", "(I)[J", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsLongArray", "(I)[J", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsFloatArray", "(I)[F", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsFloatArray", "(I)[F", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsDoubleArray", "(I)[D", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsDoubleArray", "(I)[D", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAs", "(Lorg/codehaus/stax2/typed/TypedValueDecoder;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAs", "(Lorg/codehaus/stax2/typed/TypedValueDecoder;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsBoolean", "()Z", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsBoolean", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsDecimal", "()Ljava/math/BigDecimal;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsDecimal", "()Ljava/math/BigDecimal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsDouble", "()D", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsDouble", "()D", true);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsFloat", "()F", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsFloat", "()F", true);
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsInt", "()I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsInt", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsInteger", "()Ljava/math/BigInteger;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsInteger", "()Ljava/math/BigInteger;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsLong", "()J", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsLong", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsQName", "()Ljavax/xml/namespace/QName;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsBinary", "()[B", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsBinary", "()[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementAsBinary", "(Lorg/codehaus/stax2/typed/Base64Variant;)[B", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getElementAsBinary", "(Lorg/codehaus/stax2/typed/Base64Variant;)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAs", "(ILorg/codehaus/stax2/typed/TypedValueDecoder;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAs", "(ILorg/codehaus/stax2/typed/TypedValueDecoder;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsArray", "(ILorg/codehaus/stax2/typed/TypedArrayDecoder;)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsArray", "(ILorg/codehaus/stax2/typed/TypedArrayDecoder;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsBinary", "(I)[B", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsBinary", "(I)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAsBinary", "(ILorg/codehaus/stax2/typed/Base64Variant;)[B", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "getAttributeAsBinary", "(ILorg/codehaus/stax2/typed/Base64Variant;)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readElementAsDoubleArray", "([DII)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "readElementAsDoubleArray", "([DII)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readElementAsFloatArray", "([FII)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "readElementAsFloatArray", "([FII)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readElementAsIntArray", "([III)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "readElementAsIntArray", "([III)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readElementAsLongArray", "([JII)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "readElementAsLongArray", "([JII)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readElementAsArray", "(Lorg/codehaus/stax2/typed/TypedArrayDecoder;)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "readElementAsArray", "(Lorg/codehaus/stax2/typed/TypedArrayDecoder;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readElementAsBinary", "([BII)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "readElementAsBinary", "([BII)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readElementAsBinary", "([BIILorg/codehaus/stax2/typed/Base64Variant;)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/util/StreamReader2Delegate", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "readElementAsBinary", "([BIILorg/codehaus/stax2/typed/Base64Variant;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

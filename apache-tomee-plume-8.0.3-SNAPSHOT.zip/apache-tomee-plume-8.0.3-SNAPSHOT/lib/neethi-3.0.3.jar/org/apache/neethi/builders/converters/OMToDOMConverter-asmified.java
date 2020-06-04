package asm.org.apache.neethi.builders.converters;
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
public class OMToDOMConverterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/neethi/builders/converters/OMToDOMConverter", "Lorg/apache/neethi/builders/converters/AbstractOMConverter;Lorg/apache/neethi/builders/converters/Converter<Lorg/apache/axiom/om/OMElement;Lorg/w3c/dom/Element;>;", "org/apache/neethi/builders/converters/AbstractOMConverter", new String[] { "org/apache/neethi/builders/converters/Converter" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/builders/converters/AbstractOMConverter", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "convert", "(Lorg/apache/axiom/om/OMElement;)Lorg/w3c/dom/Element;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/axiom/om/OMException");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("dom");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/axiom/om/OMAbstractFactory", "getMetaFactory", "(Ljava/lang/String;)Lorg/apache/axiom/om/OMMetaFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/axiom/om/OMMetaFactory", "getOMFactory", "()Lorg/apache/axiom/om/OMFactory;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/axiom/om/OMElement", "getXMLStreamReader", "()Ljavax/xml/stream/XMLStreamReader;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/axiom/om/OMXMLBuilderFactory", "createStAXOMBuilder", "(Lorg/apache/axiom/om/OMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/apache/axiom/om/OMXMLParserWrapper;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/axiom/om/OMXMLParserWrapper", "getDocumentElement", "()Lorg/apache/axiom/om/OMElement;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/neethi/builders/converters/StaxToDOMConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/builders/converters/StaxToDOMConverter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/axiom/om/OMElement", "getXMLStreamReader", "()Ljavax/xml/stream/XMLStreamReader;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/builders/converters/StaxToDOMConverter", "convert", "(Ljavax/xml/stream/XMLStreamReader;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "convert", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/axiom/om/OMElement");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/builders/converters/OMToDOMConverter", "convert", "(Lorg/apache/axiom/om/OMElement;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getChildren", "(Ljava/lang/Object;)Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/axiom/om/OMElement");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/builders/converters/AbstractOMConverter", "getChildren", "(Lorg/apache/axiom/om/OMElement;)Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getAttributes", "(Ljava/lang/Object;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/axiom/om/OMElement");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/builders/converters/AbstractOMConverter", "getAttributes", "(Lorg/apache/axiom/om/OMElement;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getQName", "(Ljava/lang/Object;)Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/axiom/om/OMElement");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/builders/converters/AbstractOMConverter", "getQName", "(Lorg/apache/axiom/om/OMElement;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

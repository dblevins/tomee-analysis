package asm.org.apache.cxf.transport.http.blueprint;
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
public class HttpDestinationBPBeanDefinitionParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/http/blueprint/HttpDestinationBPBeanDefinitionParser", null, "org/apache/cxf/configuration/blueprint/AbstractBPBeanDefinitionParser", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "HTTP_NS", "Ljava/lang/String;", null, "http://cxf.apache.org/transports/http/configuration");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/configuration/blueprint/AbstractBPBeanDefinitionParser", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;)Lorg/osgi/service/blueprint/reflect/Metadata;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/ParserContext", "createMetadata", "(Ljava/lang/Class;)Lorg/osgi/service/blueprint/reflect/Metadata;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/aries/blueprint/mutable/MutableBeanMetadata");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transport/http/AbstractHTTPDestination;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "setRuntimeClass", "(Ljava/lang/Class;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://cxf.apache.org/transports/http/configuration");
methodVisitor.visitLdcInsn("server");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("server");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transports/http/configuration/HTTPServerPolicy;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/blueprint/HttpDestinationBPBeanDefinitionParser", "mapElementToJaxbProperty", "(Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;Lorg/w3c/dom/Element;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://cxf.apache.org/transports/http/configuration");
methodVisitor.visitLdcInsn("fixedParameterOrder");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("fixedParameterOrder");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/blueprint/HttpDestinationBPBeanDefinitionParser", "mapElementToJaxbProperty", "(Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;Lorg/w3c/dom/Element;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://cxf.apache.org/transports/http/configuration");
methodVisitor.visitLdcInsn("contextMatchStrategy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("contextMatchStrategy");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/blueprint/HttpDestinationBPBeanDefinitionParser", "mapElementToJaxbProperty", "(Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;Lorg/w3c/dom/Element;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/blueprint/HttpDestinationBPBeanDefinitionParser", "parseAttributes", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/blueprint/HttpDestinationBPBeanDefinitionParser", "parseChildElements", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("prototype");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "setScope", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processNameAttribute", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "setId", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

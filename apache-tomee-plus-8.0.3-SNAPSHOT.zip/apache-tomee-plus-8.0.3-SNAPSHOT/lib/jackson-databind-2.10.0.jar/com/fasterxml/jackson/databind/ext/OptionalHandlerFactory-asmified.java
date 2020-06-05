package asm.com.fasterxml.jackson.databind.ext;
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
public class OptionalHandlerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PACKAGE_PREFIX_JAVAX_XML", "Ljava/lang/String;", null, "javax.xml.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SERIALIZERS_FOR_JAVAX_XML", "Ljava/lang/String;", null, "com.fasterxml.jackson.databind.ext.CoreXMLSerializers");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DESERIALIZERS_FOR_JAVAX_XML", "Ljava/lang/String;", null, "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SERIALIZER_FOR_DOM_NODE", "Ljava/lang/String;", null, "com.fasterxml.jackson.databind.ext.DOMSerializer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DESERIALIZER_FOR_DOM_DOCUMENT", "Ljava/lang/String;", null, "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DESERIALIZER_FOR_DOM_NODE", "Ljava/lang/String;", null, "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CLASS_DOM_NODE", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CLASS_DOM_DOCUMENT", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_jdk7Helper", "Lcom/fasterxml/jackson/databind/ext/Java7Handlers;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "instance", "Lcom/fasterxml/jackson/databind/ext/OptionalHandlerFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findSerializer", "(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;", "(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/JavaType", "getRawClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "CLASS_DOM_NODE", "Ljava/lang/Class;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "CLASS_DOM_NODE", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("com.fasterxml.jackson.databind.ext.DOMSerializer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "instantiate", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/JsonSerializer");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "_jdk7Helper", "Lcom/fasterxml/jackson/databind/ext/Java7Handlers;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "_jdk7Helper", "Lcom/fasterxml/jackson/databind/ext/Java7Handlers;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ext/Java7Handlers", "getSerializerForJavaNioFilePath", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonSerializer;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("javax.xml.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("javax.xml.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "hasSuperClassStartingWith", "(Ljava/lang/Class;Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("com.fasterxml.jackson.databind.ext.CoreXMLSerializers");
methodVisitor.visitVarInsn(ASTORE, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "instantiate", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/ser/Serializers");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/ser/Serializers", "findSerializer", "(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findDeserializer", "(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;", "(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;", new String[] { "com/fasterxml/jackson/databind/JsonMappingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/JavaType", "getRawClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "_jdk7Helper", "Lcom/fasterxml/jackson/databind/ext/Java7Handlers;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "_jdk7Helper", "Lcom/fasterxml/jackson/databind/ext/Java7Handlers;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ext/Java7Handlers", "getDeserializerForJavaNioFilePath", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonDeserializer;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "CLASS_DOM_NODE", "Ljava/lang/Class;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "CLASS_DOM_NODE", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "instantiate", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/JsonDeserializer");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "CLASS_DOM_DOCUMENT", "Ljava/lang/Class;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "CLASS_DOM_DOCUMENT", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "instantiate", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/JsonDeserializer");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("javax.xml.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("javax.xml.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "hasSuperClassStartingWith", "(Ljava/lang/Class;Ljava/lang/String;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
methodVisitor.visitVarInsn(ASTORE, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "instantiate", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/deser/Deserializers");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/deser/Deserializers", "findBeanDeserializer", "(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "instantiate", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/LinkageError");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/util/ClassUtil", "createInstance", "(Ljava/lang/Class;Z)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/LinkageError"});
methodVisitor.visitVarInsn(ASTORE, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "hasSuperClassStartingWith", "(Ljava/lang/Class;Ljava/lang/String;)Z", "(Ljava/lang/Class<*>;Ljava/lang/String;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSuperclass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSuperclass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/w3c/dom/Node;"));
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/w3c/dom/Document;"));
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"java/lang/Class", "java/lang/Class"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ext/OptionalHandlerFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Could not load DOM `Node` and/or `Document` classes: no DOM support");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "CLASS_DOM_NODE", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "CLASS_DOM_DOCUMENT", "Ljava/lang/Class;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/ext/Java7Handlers", "instance", "()Lcom/fasterxml/jackson/databind/ext/Java7Handlers;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"com/fasterxml/jackson/databind/ext/Java7Handlers"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "_jdk7Helper", "Lcom/fasterxml/jackson/databind/ext/Java7Handlers;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ext/OptionalHandlerFactory", "instance", "Lcom/fasterxml/jackson/databind/ext/OptionalHandlerFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

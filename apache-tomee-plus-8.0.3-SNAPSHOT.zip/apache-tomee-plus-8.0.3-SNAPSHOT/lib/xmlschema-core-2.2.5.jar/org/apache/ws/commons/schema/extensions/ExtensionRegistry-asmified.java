package asm.org.apache.ws.commons.schema.extensions;
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
public class ExtensionRegistryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "extensionSerializers", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class<*>;Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "extensionDeserializers", "Ljava/util/Map;", "Ljava/util/Map<Ljavax/xml/namespace/QName;Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultExtensionSerializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultExtensionDeserializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "extensionSerializers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "extensionDeserializers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/extensions/DefaultExtensionSerializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/extensions/DefaultExtensionSerializer", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionSerializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/extensions/DefaultExtensionDeserializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/extensions/DefaultExtensionDeserializer", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionDeserializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultExtensionSerializer", "()Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionSerializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultExtensionSerializer", "(Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionSerializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultExtensionDeserializer", "()Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionDeserializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultExtensionDeserializer", "(Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionDeserializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerDeserializer", "(Ljavax/xml/namespace/QName;Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "extensionDeserializers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerSerializer", "(Ljava/lang/Class;Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;)V", "(Ljava/lang/Class<*>;Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "extensionSerializers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unregisterSerializer", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "extensionSerializers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unregisterDeserializer", "(Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "extensionDeserializers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serializeExtension", "(Lorg/apache/ws/commons/schema/XmlSchemaObject;Ljava/lang/Class;Lorg/w3c/dom/Node;)V", "(Lorg/apache/ws/commons/schema/XmlSchemaObject;Ljava/lang/Class<*>;Lorg/w3c/dom/Node;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "extensionSerializers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/ws/commons/schema/extensions/ExtensionSerializer");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/ws/commons/schema/extensions/ExtensionSerializer", "serialize", "(Lorg/apache/ws/commons/schema/XmlSchemaObject;Ljava/lang/Class;Lorg/w3c/dom/Node;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionSerializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionSerializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionSerializer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/ws/commons/schema/extensions/ExtensionSerializer", "serialize", "(Lorg/apache/ws/commons/schema/XmlSchemaObject;Ljava/lang/Class;Lorg/w3c/dom/Node;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deserializeExtension", "(Lorg/apache/ws/commons/schema/XmlSchemaObject;Ljavax/xml/namespace/QName;Lorg/w3c/dom/Node;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "extensionDeserializers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/ws/commons/schema/extensions/ExtensionDeserializer");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/ws/commons/schema/extensions/ExtensionDeserializer", "deserialize", "(Lorg/apache/ws/commons/schema/XmlSchemaObject;Ljavax/xml/namespace/QName;Lorg/w3c/dom/Node;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionDeserializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/extensions/ExtensionRegistry", "defaultExtensionDeserializer", "Lorg/apache/ws/commons/schema/extensions/ExtensionDeserializer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/ws/commons/schema/extensions/ExtensionDeserializer", "deserialize", "(Lorg/apache/ws/commons/schema/XmlSchemaObject;Ljavax/xml/namespace/QName;Lorg/w3c/dom/Node;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

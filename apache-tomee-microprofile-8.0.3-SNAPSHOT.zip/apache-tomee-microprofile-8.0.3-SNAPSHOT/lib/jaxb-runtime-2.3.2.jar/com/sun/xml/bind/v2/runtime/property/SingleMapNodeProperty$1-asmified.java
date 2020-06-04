package asm.com.sun.xml.bind.v2.runtime.property;
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
public class SingleMapNodeProperty$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", null, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", null, null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "Stack", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "State", ACC_PUBLIC | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "target", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack<TBeanT;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "map", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack<TValueT;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", "<init>", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "target", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "map", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "com/sun/xml/bind/api/AccessorException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "getPrev", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "getTarget", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "access$000", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "access$100", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/ClassFactory", "create", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "target", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "access$200", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "map", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "access$200", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "setTarget", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "com/sun/xml/bind/v2/runtime/unmarshaller/TagName"}, 1, new Object[] {"com/sun/xml/bind/api/AccessorException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "handleGenericException", "(Ljava/lang/Exception;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "setTarget", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "leaveElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "com/sun/xml/bind/api/AccessorException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", "leaveElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "access$000", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "target", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "access$300", "(Ljava/lang/ThreadLocal;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "map", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "access$300", "(Ljava/lang/ThreadLocal;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/xml/bind/api/AccessorException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "handleGenericException", "(Ljava/lang/Exception;Z)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "childElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "access$400", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/Name;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/TagName", "matches", "(Lcom/sun/xml/bind/v2/runtime/Name;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "access$500", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "setLoader", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", "childElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpectedChildElements", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "access$400", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/Name;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/Name", "toQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singleton", "(Ljava/lang/Object;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

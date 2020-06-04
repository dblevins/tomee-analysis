package asm.com.sun.xml.bind.v2.runtime.unmarshaller;
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
public class ProxyLoaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/sun/xml/bind/v2/runtime/unmarshaller/ProxyLoader", null, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "State", ACC_PUBLIC | ACC_FINAL);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", "<init>", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "startElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/ProxyLoader", "selectLoader", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State", "setLoader", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Loader", "startElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "selectLoader", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "leaveElement", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext$State;Lcom/sun/xml/bind/v2/runtime/unmarshaller/TagName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

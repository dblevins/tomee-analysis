package asm.com.sun.xml.fastinfoset.stax;
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
public class StAXDocumentParser$NamespaceContextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/fastinfoset/stax/StAXDocumentParser$NamespaceContextImpl", null, "java/lang/Object", new String[] { "javax/xml/namespace/NamespaceContext" });

classWriter.visitInnerClass("com/sun/xml/fastinfoset/stax/StAXDocumentParser$NamespaceContextImpl", "com/sun/xml/fastinfoset/stax/StAXDocumentParser", "NamespaceContextImpl", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/stax/StAXDocumentParser$NamespaceContextImpl", "this$0", "Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/stax/StAXDocumentParser$NamespaceContextImpl", "this$0", "Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/stax/StAXDocumentParser", "access$000", "(Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;)Lcom/sun/xml/fastinfoset/util/PrefixArray;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/PrefixArray", "getNamespaceFromPrefix", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/stax/StAXDocumentParser$NamespaceContextImpl", "this$0", "Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/stax/StAXDocumentParser", "access$100", "(Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;)Lcom/sun/xml/fastinfoset/util/PrefixArray;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/PrefixArray", "getPrefixFromNamespace", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getPrefixes", "(Ljava/lang/String;)Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/stax/StAXDocumentParser$NamespaceContextImpl", "this$0", "Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/stax/StAXDocumentParser", "access$200", "(Lcom/sun/xml/fastinfoset/stax/StAXDocumentParser;)Lcom/sun/xml/fastinfoset/util/PrefixArray;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/PrefixArray", "getPrefixesFromNamespace", "(Ljava/lang/String;)Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

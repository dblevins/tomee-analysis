package asm.com.ctc.wstx.util;
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
public class DefaultXmlSymbolTableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/ctc/wstx/util/DefaultXmlSymbolTable", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "sInstance", "Lcom/ctc/wstx/util/SymbolTable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "mNsPrefixXml", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "mNsPrefixXmlns", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lcom/ctc/wstx/util/SymbolTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "makeChild", "()Lcom/ctc/wstx/util/SymbolTable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getXmlSymbol", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "mNsPrefixXml", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getXmlnsSymbol", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "mNsPrefixXmlns", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/util/SymbolTable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/util/SymbolTable", "<init>", "(ZI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("xml");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "mNsPrefixXml", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "mNsPrefixXmlns", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("id");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("xsd");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("xsi");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("soap");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("SOAP-ENC");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("SOAP-ENV");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("Body");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "sInstance", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitLdcInsn("Envelope");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "findSymbol", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

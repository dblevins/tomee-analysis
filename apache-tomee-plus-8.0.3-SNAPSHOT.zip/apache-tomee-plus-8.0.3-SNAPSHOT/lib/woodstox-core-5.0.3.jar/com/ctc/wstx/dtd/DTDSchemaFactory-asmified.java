package asm.com.ctc.wstx.dtd;
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
public class DTDSchemaFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/ctc/wstx/dtd/DTDSchemaFactory", null, "org/codehaus/stax2/validation/XMLValidationSchemaFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "mRootSymbols", "Lcom/ctc/wstx/util/SymbolTable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "mSchemaConfig", "Lcom/ctc/wstx/api/ValidatorConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "mReaderConfig", "Lcom/ctc/wstx/api/ReaderConfig;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://www.w3.org/XML/1998/namespace");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/validation/XMLValidationSchemaFactory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/api/ReaderConfig", "createFullDefaults", "()Lcom/ctc/wstx/api/ReaderConfig;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDSchemaFactory", "mReaderConfig", "Lcom/ctc/wstx/api/ReaderConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/api/ValidatorConfig", "createDefaults", "()Lcom/ctc/wstx/api/ValidatorConfig;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDSchemaFactory", "mSchemaConfig", "Lcom/ctc/wstx/api/ValidatorConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPropertySupported", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDSchemaFactory", "mSchemaConfig", "Lcom/ctc/wstx/api/ValidatorConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ValidatorConfig", "isPropertySupported", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDSchemaFactory", "mSchemaConfig", "Lcom/ctc/wstx/api/ValidatorConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ValidatorConfig", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDSchemaFactory", "mSchemaConfig", "Lcom/ctc/wstx/api/ValidatorConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ValidatorConfig", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSchema", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/DTDSchemaFactory", "createPrivateReaderConfig", "()Lcom/ctc/wstx/api/ReaderConfig;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/io/SystemId", "construct", "(Ljava/lang/String;)Lcom/ctc/wstx/io/SystemId;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/io/StreamBootstrapper", "getInstance", "(Ljava/lang/String;Lcom/ctc/wstx/io/SystemId;Ljava/io/InputStream;)Lcom/ctc/wstx/io/StreamBootstrapper;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDSchemaFactory", "doCreateSchema", "(Lcom/ctc/wstx/api/ReaderConfig;Lcom/ctc/wstx/io/InputBootstrapper;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSchema", "(Ljava/io/Reader;Ljava/lang/String;Ljava/lang/String;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/DTDSchemaFactory", "createPrivateReaderConfig", "()Lcom/ctc/wstx/api/ReaderConfig;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/io/SystemId", "construct", "(Ljava/lang/String;)Lcom/ctc/wstx/io/SystemId;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/io/ReaderBootstrapper", "getInstance", "(Ljava/lang/String;Lcom/ctc/wstx/io/SystemId;Ljava/io/Reader;Ljava/lang/String;)Lcom/ctc/wstx/io/ReaderBootstrapper;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDSchemaFactory", "doCreateSchema", "(Lcom/ctc/wstx/api/ReaderConfig;Lcom/ctc/wstx/io/InputBootstrapper;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSchema", "(Ljava/net/URL;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/DTDSchemaFactory", "createPrivateReaderConfig", "()Lcom/ctc/wstx/api/ReaderConfig;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/URLUtil", "inputStreamFromURL", "(Ljava/net/URL;)Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/io/StreamBootstrapper", "getInstance", "(Ljava/lang/String;Lcom/ctc/wstx/io/SystemId;Ljava/io/InputStream;)Lcom/ctc/wstx/io/StreamBootstrapper;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDSchemaFactory", "doCreateSchema", "(Lcom/ctc/wstx/api/ReaderConfig;Lcom/ctc/wstx/io/InputBootstrapper;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/ctc/wstx/dtd/DTDSchemaFactory", "java/net/URL", "com/ctc/wstx/api/ReaderConfig"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/exc/WstxIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/exc/WstxIOException", "<init>", "(Ljava/io/IOException;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSchema", "(Ljava/io/File;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/DTDSchemaFactory", "createPrivateReaderConfig", "()Lcom/ctc/wstx/api/ReaderConfig;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/URLUtil", "toURL", "(Ljava/io/File;)Ljava/net/URL;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(NEW, "java/io/FileInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FileInputStream", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/io/StreamBootstrapper", "getInstance", "(Ljava/lang/String;Lcom/ctc/wstx/io/SystemId;Ljava/io/InputStream;)Lcom/ctc/wstx/io/StreamBootstrapper;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDSchemaFactory", "doCreateSchema", "(Lcom/ctc/wstx/api/ReaderConfig;Lcom/ctc/wstx/io/InputBootstrapper;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/ctc/wstx/dtd/DTDSchemaFactory", "java/io/File", "com/ctc/wstx/api/ReaderConfig"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/exc/WstxIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/exc/WstxIOException", "<init>", "(Ljava/io/IOException;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doCreateSchema", "(Lcom/ctc/wstx/api/ReaderConfig;Lcom/ctc/wstx/io/InputBootstrapper;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/InputBootstrapper", "bootstrapInput", "(Lcom/ctc/wstx/api/ReaderConfig;ZI)Ljava/io/Reader;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/InputBootstrapper", "declaredXml11", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "enableXml11", "(Z)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/io/Reader"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/URLUtil", "urlFromCurrentDir", "()Ljava/net/URL;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/io/SystemId", "construct", "(Ljava/lang/String;Ljava/net/URL;)Lcom/ctc/wstx/io/SystemId;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/io/InputSourceFactory", "constructEntitySource", "(Lcom/ctc/wstx/api/ReaderConfig;Lcom/ctc/wstx/io/WstxInputSource;Ljava/lang/String;Lcom/ctc/wstx/io/InputBootstrapper;Ljava/lang/String;Lcom/ctc/wstx/io/SystemId;ILjava/io/Reader;)Lcom/ctc/wstx/io/ReaderSource;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/InputBootstrapper", "getDeclaredVersion", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/dtd/FullDTDReader", "readExternalSubset", "(Lcom/ctc/wstx/io/WstxInputSource;Lcom/ctc/wstx/api/ReaderConfig;Lcom/ctc/wstx/dtd/DTDSubset;ZI)Lcom/ctc/wstx/dtd/DTDSubset;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/ctc/wstx/dtd/DTDSchemaFactory", "com/ctc/wstx/api/ReaderConfig", "com/ctc/wstx/io/InputBootstrapper", "java/lang/String", "java/lang/String", "java/net/URL"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/exc/WstxIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/exc/WstxIOException", "<init>", "(Ljava/io/IOException;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(8, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createPrivateReaderConfig", "()Lcom/ctc/wstx/api/ReaderConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDSchemaFactory", "mReaderConfig", "Lcom/ctc/wstx/api/ReaderConfig;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/dtd/DTDSchemaFactory", "mRootSymbols", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "makeChild", "()Lcom/ctc/wstx/util/SymbolTable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "createNonShared", "(Lcom/ctc/wstx/util/SymbolTable;)Lcom/ctc/wstx/api/ReaderConfig;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DefaultXmlSymbolTable", "getInstance", "()Lcom/ctc/wstx/util/SymbolTable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/dtd/DTDSchemaFactory", "mRootSymbols", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/dtd/DTDSchemaFactory", "mRootSymbols", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/SymbolTable", "setInternStrings", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

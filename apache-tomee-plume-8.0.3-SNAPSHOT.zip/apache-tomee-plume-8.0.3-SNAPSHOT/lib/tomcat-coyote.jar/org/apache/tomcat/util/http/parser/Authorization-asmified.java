package asm.org.apache.tomcat.util.http.parser;
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
public class AuthorizationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/http/parser/Authorization", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomcat/util/http/parser/Authorization$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/tomcat/util/http/parser/Authorization$FieldType", "org/apache/tomcat/util/http/parser/Authorization", "FieldType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "fieldTypes", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseAuthorizationDigest", "(Ljava/io/StringReader;)Ljava/util/Map;", "(Ljava/io/StringReader;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", new String[] { "java/lang/IllegalArgumentException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Digest");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "skipConstant", "(Ljava/io/Reader;Ljava/lang/String;)Lorg/apache/tomcat/util/http/parser/SkipResult;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/SkipResult", "FOUND", "Lorg/apache/tomcat/util/http/parser/SkipResult;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "readToken", "(Ljava/io/Reader;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("=");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "skipConstant", "(Ljava/io/Reader;Ljava/lang/String;)Lorg/apache/tomcat/util/http/parser/SkipResult;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/SkipResult", "FOUND", "Lorg/apache/tomcat/util/http/parser/SkipResult;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "ENGLISH", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "(Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/http/parser/Authorization$FieldType");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "TOKEN_OR_QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "org/apache/tomcat/util/http/parser/Authorization$FieldType"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$1", "$SwitchMap$org$apache$tomcat$util$http$parser$Authorization$FieldType", "[I");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTableSwitchInsn(1, 4, label9, new Label[] { label5, label6, label7, label8 });
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "readQuotedString", "(Ljava/io/Reader;Z)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "readTokenOrQuotedString", "(Ljava/io/Reader;Z)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "readLhex", "(Ljava/io/Reader;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "readQuotedToken", "(Ljava/io/Reader;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(",");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "skipConstant", "(Ljava/io/Reader;Ljava/lang/String;)Lorg/apache/tomcat/util/http/parser/SkipResult;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/SkipResult", "NOT_FOUND", "Lorg/apache/tomcat/util/http/parser/SkipResult;");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label11);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "readToken", "(Ljava/io/Reader;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label12);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("username");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("realm");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("nonce");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("digest-uri");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("response");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "LHEX", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("algorithm");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_TOKEN", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("cnonce");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("opaque");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("qop");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_TOKEN", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization", "fieldTypes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("nc");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "LHEX", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

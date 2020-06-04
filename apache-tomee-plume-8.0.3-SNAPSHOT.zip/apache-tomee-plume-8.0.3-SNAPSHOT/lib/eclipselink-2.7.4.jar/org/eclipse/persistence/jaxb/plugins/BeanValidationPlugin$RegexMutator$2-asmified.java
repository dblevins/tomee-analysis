package asm.org.eclipse.persistence.jaxb.plugins;
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
public class BeanValidationPlugin$RegexMutator$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "Ljava/util/LinkedHashMap<Ljava/util/regex/Pattern;Ljava/lang/String;>;", "java/util/LinkedHashMap", null);

classWriter.visitOuterClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator", null, null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator", "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "RegexMutator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "this$1", "Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\i");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[:A-Z_a-z\\\\u00C0-\\\\u00D6\\\\u00D8-\\\\u00F6\\\\u00F8-\\\\u02FF\\\\u0370-\\\\u037D\\\\u037F-\\\\u1FFF\\\\u200C-\\\\u200D\\\\u2070-\\\\u218F\\\\u2C00-\\\\u2FEF\\\\u3001-\\\\uD7FF\\\\uF900-\\\\uFDCF\\\\uFDF0-\\\\uFFFD]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[^:A-Z_a-z\\\\u00C0-\\\\u00D6\\\\u00D8-\\\\u00F6\\\\u00F8-\\\\u02FF\\\\u0370-\\\\u037D\\\\u037F-\\\\u1FFF\\\\u200C-\\\\u200D\\\\u2070-\\\\u218F\\\\u2C00-\\\\u2FEF\\\\u3001-\\\\uD7FF\\\\uF900-\\\\uFDCF\\\\uFDF0-\\\\uFFFD]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\c");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[-.0-9:A-Z_a-z\\\\u00B7\\\\u00C0-\\\\u00D6\\\\u00D8-\\\\u00F6\\\\u00F8-\\\\u037D\\\\u037F-\\\\u1FFF\\\\u200C-\\\\u200D\\\\u203F\\\\u2040\\\\u2070-\\\\u218F\\\\u2C00-\\\\u2FEF\\\\u3001-\\\\uD7FF\\\\uF900-\\\\uFDCF\\\\uFDF0-\\\\uFFFD]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[^-.0-9:A-Z_a-z\\\\u00B7\\\\u00C0-\\\\u00D6\\\\u00D8-\\\\u00F6\\\\u00F8-\\\\u037D\\\\u037F-\\\\u1FFF\\\\u200C-\\\\u200D\\\\u203F\\\\u2040\\\\u2070-\\\\u218F\\\\u2C00-\\\\u2FEF\\\\u3001-\\\\uD7FF\\\\uF900-\\\\uFDCF\\\\uFDF0-\\\\uFFFD]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\s");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[\\\\u0009-\\\\u000D\\\\u0020\\\\u0085\\\\u00A0\\\\u1680\\\\u180E\\\\u2000-\\\\u200A\\\\u2028\\\\u2029\\\\u202F\\\\u205F\\\\u3000]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\S");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[^\\\\u0009-\\\\u000D\\\\u0020\\\\u0085\\\\u00A0\\\\u1680\\\\u180E\\\\u2000-\\\\u200A\\\\u2028\\\\u2029\\\\u202F\\\\u205F\\\\u3000]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\v");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[\\\\u000A-\\\\u000D\\\\u0085\\\\u2028\\\\u2029]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\V");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[^\\\\u000A-\\\\u000D\\\\u0085\\\\u2028\\\\u2029]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\h");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[\\\\u0009\\\\u0020\\\\u00A0\\\\u1680\\\\u180E\\\\u2000-\\\\u200A\\\\u202F\\\\u205F\\\\u3000]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\H");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[^\\\\u0009\\\\u0020\\\\u00A0\\\\u1680\\\\u180E\\\\u2000\\\\u2001-\\\\u200A\\\\u202F\\\\u205F\\\\u3000]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\w");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\W");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("[^\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\b");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("(?:(?<=[\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]])(?![\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]])|(?<![\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]])(?=[\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]]))");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("(?:(?<=[\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]])(?=[\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]])|(?<![\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]])(?![\\\\pL\\\\pM\\\\p{Nd}\\\\p{Nl}\\\\p{Pc}[\\\\p{InEnclosedAlphanumerics}&&\\\\p{So}]]))");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\d");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("\\\\p{Nd}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\D");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("\\\\P{Nd}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\R");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("(?:(?>\\\\u000D\\\\u000A)|[\\\\u000A\\\\u000B\\\\u000C\\\\u000D\\\\u0085\\\\u2028\\\\u2029])");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\\\X");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitLdcInsn("(?:(?:\\\\u000D\\\\u000A)|(?:[\\\\u0E40\\\\u0E41\\\\u0E42\\\\u0E43\\\\u0E44\\\\u0EC0\\\\u0EC1\\\\u0EC2\\\\u0EC3\\\\u0EC4\\\\uAAB5\\\\uAAB6\\\\uAAB9\\\\uAABB\\\\uAABC]*(?:[\\\\u1100-\\\\u115F\\\\uA960-\\\\uA97C]+|([\\\\u1100-\\\\u115F\\\\uA960-\\\\uA97C]*((?:[[\\\\u1160-\\\\u11A2\\\\uD7B0-\\\\uD7C6][\\\\uAC00\\\\uAC1C\\\\uAC38]][\\\\u1160-\\\\u11A2\\\\uD7B0-\\\\uD7C6]*|[\\\\uAC01\\\\uAC02\\\\uAC03\\\\uAC04])[\\\\u11A8-\\\\u11F9\\\\uD7CB-\\\\uD7FB]*))|[\\\\u11A8-\\\\u11F9\\\\uD7CB-\\\\uD7FB]+|[^[\\\\p{Zl}\\\\p{Zp}\\\\p{Cc}\\\\p{Cf}&&[^\\\\u000D\\\\u000A\\\\u200C\\\\u200D]]\\\\u000D\\\\u000A])[[\\\\p{Mn}\\\\p{Me}\\\\u200C\\\\u200D\\\\u0488\\\\u0489\\\\u20DD\\\\u20DE\\\\u20DF\\\\u20E0\\\\u20E2\\\\u20E3\\\\u20E4\\\\uA670\\\\uA671\\\\uA672\\\\uFF9E\\\\uFF9F][\\\\p{Mc}\\\\u0E30\\\\u0E32\\\\u0E33\\\\u0E45\\\\u0EB0\\\\u0EB2\\\\u0EB3]]*)|(?s:.))");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$RegexMutator$2", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

package asm.org.apache.openejb.config;
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
public class EffectiveTomEEXmlDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/openejb/config/EffectiveTomEEXml", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "main", "([Ljava/lang/String;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/EffectiveTomEEXml", "parseCommand", "([Ljava/lang/String;)Lorg/apache/commons/cli/CommandLine;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/cli/CommandLine"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/EffectiveTomEEXml", "findXml", "(Lorg/apache/commons/cli/CommandLine;)Ljava/io/File;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "getCanonicalPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/JaxbOpenejb", "readConfig", "(Ljava/lang/String;)Lorg/apache/openejb/config/sys/Openejb;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/ConfigurationFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/ConfigurationFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/Openejb", "getResource", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/openejb/config/sys/Openejb", "org/apache/openejb/config/ConfigurationFactory", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/config/sys/Resource");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/ResourceInfo;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/ConfigurationFactory", "configureService", "(Lorg/apache/openejb/config/Service;Ljava/lang/Class;)Lorg/apache/openejb/assembler/classic/ServiceInfo;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ResourceInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "properties", "Ljava/util/Properties;");
methodVisitor.visitLdcInsn("SkipImplicitAttributes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "containsKey", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "properties", "Ljava/util/Properties;");
methodVisitor.visitLdcInsn("SkipImplicitAttributes");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openejb/config/sys/Resource", "org/apache/openejb/assembler/classic/ResourceInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/Resource", "getProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "clear", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/Resource", "getProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "properties", "Ljava/util/Properties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "putAll", "(Ljava/util/Map;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/config/sys/Openejb;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/sys/JaxbOpenejb", "getContext", "(Ljava/lang/Class;)Ljakarta/xml/bind/JAXBContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/bind/JAXBContext", "createMarshaller", "()Ljakarta/xml/bind/Marshaller;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("jaxb.formatted.output");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/bind/Marshaller", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/bind/Marshaller", "marshal", "(Ljava/lang/Object;Ljava/io/OutputStream;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "parseCommand", "([Ljava/lang/String;)Lorg/apache/commons/cli/CommandLine;", null, new String[] { "org/apache/openejb/cli/SystemExitException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/commons/cli/ParseException");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/cli/Options");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/cli/Options", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "hasArg", "(Z)Lorg/apache/commons/cli/OptionBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("path");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "withLongOpt", "(Ljava/lang/String;)Lorg/apache/commons/cli/OptionBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("[openejb|tomee].xml path");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "withDescription", "(Ljava/lang/String;)Lorg/apache/commons/cli/OptionBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("p");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "create", "(Ljava/lang/String;)Lorg/apache/commons/cli/Option;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/Options", "addOption", "(Lorg/apache/commons/cli/Option;)Lorg/apache/commons/cli/Options;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/cli/PosixParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/cli/PosixParser", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/PosixParser", "parse", "(Lorg/apache/commons/cli/Options;[Ljava/lang/String;)Lorg/apache/commons/cli/CommandLine;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"[Ljava/lang/String;", "org/apache/commons/cli/Options"}, 1, new Object[] {"org/apache/commons/cli/ParseException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/EffectiveTomEEXml", "help", "(Lorg/apache/commons/cli/Options;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/cli/SystemExitException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/cli/SystemExitException", "<init>", "(I)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/cli/CommandLine"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("help");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/CommandLine", "hasOption", "(Ljava/lang/String;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/EffectiveTomEEXml", "help", "(Lorg/apache/commons/cli/Options;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "findXml", "(Lorg/apache/commons/cli/CommandLine;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("path");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/CommandLine", "hasOption", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("path");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/CommandLine", "getOptionValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/io/File"}, 0, null);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("tomee.xml");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("openejb.xml");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("openejb.base");
methodVisitor.visitLdcInsn("openejb.home");
methodVisitor.visitLdcInsn("catalina.base");
methodVisitor.visitLdcInsn("missing");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/JavaSecurityManagers", "getSystemProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/JavaSecurityManagers", "getSystemProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/JavaSecurityManagers", "getSystemProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "isFile", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "isFile", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" doesnt exist");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "help", "(Lorg/apache/commons/cli/Options;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/cli/HelpFormatter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/cli/HelpFormatter", "<init>", "()V", false);
methodVisitor.visitLdcInsn("effectivetomee [options] <value>");
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/HelpFormatter", "printHelp", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/cli/Options;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}

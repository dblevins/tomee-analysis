package asm.org.apache.tomcat.util.http;
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
public class FastHttpDateFormatDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/tomcat/util/http/FastHttpDateFormat", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CACHE_SIZE", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "RFC1123_DATE", "Ljava/lang/String;", null, "EEE, dd MMM yyyy HH:mm:ss zzz");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DATE_RFC5322", "Ljava/lang/String;", null, "EEE, dd MMM yyyy HH:mm:ss z");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DATE_OBSOLETE_RFC850", "Ljava/lang/String;", null, "EEEEEE, dd-MMM-yy HH:mm:ss zzz");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DATE_OBSOLETE_ASCTIME", "Ljava/lang/String;", null, "EEE MMMM d HH:mm:ss yyyy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FORMAT_RFC5322", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FORMAT_OBSOLETE_RFC850", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FORMAT_OBSOLETE_ASCTIME", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "httpParseFormats", "[Lorg/apache/tomcat/util/http/ConcurrentDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "currentDateGenerated", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "currentDate", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "formatCache", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Long;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "parseCache", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "getCurrentDate", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "currentDateGenerated", "J");
methodVisitor.visitInsn(LSUB);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "FORMAT_RFC5322", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/ConcurrentDateFormat", "format", "(Ljava/util/Date;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "currentDate", "Ljava/lang/String;");
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "currentDateGenerated", "J");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "currentDate", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "formatDate", "(JLjava/text/DateFormat;)Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "formatDate", "(J)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "formatDate", "(J)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "formatCache", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Long", "java/lang/String"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "FORMAT_RFC5322", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/ConcurrentDateFormat", "format", "(Ljava/util/Date;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "updateFormatCache", "(Ljava/lang/Long;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "parseDate", "(Ljava/lang/String;[Ljava/text/DateFormat;)J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "parseDate", "(Ljava/lang/String;)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "parseDate", "(Ljava/lang/String;)J", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/text/ParseException");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "parseCache", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Long"}, 0, null);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.LONG, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitInsn(LCMP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "httpParseFormats", "[Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "httpParseFormats", "[Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/ConcurrentDateFormat", "parse", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "updateParseCache", "(Ljava/lang/String;Ljava/lang/Long;)V", false);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/text/ParseException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "updateFormatCache", "(Ljava/lang/Long;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "formatCache", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "CACHE_SIZE", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "formatCache", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "formatCache", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "updateParseCache", "(Ljava/lang/String;Ljava/lang/Long;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "parseCache", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "CACHE_SIZE", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "parseCache", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "parseCache", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("org.apache.tomcat.util.http.FastHttpDateFormat.CACHE_SIZE");
methodVisitor.visitLdcInsn("1000");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "CACHE_SIZE", "I");
methodVisitor.visitLdcInsn("GMT");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/TimeZone", "getTimeZone", "(Ljava/lang/String;)Ljava/util/TimeZone;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/ConcurrentDateFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EEE, dd MMM yyyy HH:mm:ss z");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "US", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/ConcurrentDateFormat", "<init>", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/TimeZone;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "FORMAT_RFC5322", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/ConcurrentDateFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EEEEEE, dd-MMM-yy HH:mm:ss zzz");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "US", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/ConcurrentDateFormat", "<init>", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/TimeZone;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "FORMAT_OBSOLETE_RFC850", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/ConcurrentDateFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EEE MMMM d HH:mm:ss yyyy");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "US", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/ConcurrentDateFormat", "<init>", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/TimeZone;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "FORMAT_OBSOLETE_ASCTIME", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/http/ConcurrentDateFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "FORMAT_RFC5322", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "FORMAT_OBSOLETE_RFC850", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "FORMAT_OBSOLETE_ASCTIME", "Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "httpParseFormats", "[Lorg/apache/tomcat/util/http/ConcurrentDateFormat;");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "currentDateGenerated", "J");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "currentDate", "Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "CACHE_SIZE", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "formatCache", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "CACHE_SIZE", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/FastHttpDateFormat", "parseCache", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
